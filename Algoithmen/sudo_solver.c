#include <stdio.h>
#include <stdlib.h>

void sudo_solver(char sudo[9][9]);
int suche_leer(char sudo[9][9], int *z, int *s);
int check_sudo(char sudo[9][9], int z, int s);
void print_sudo(char sudo[9][9]);

int main()
{
    char sudo[9][9] = {{0,0,0,0,0,0,0,3,0},
                       {5,0,1,0,6,0,0,2,0},
                       {2,6,0,4,3,0,0,0,5},
                       {0,0,0,0,0,2,0,0,1},
                       {0,0,3,8,0,9,2,0,0},
                       {7,0,0,1,0,0,0,0,0},
                       {8,0,0,0,1,3,0,5,2},
                       {0,0,0,0,2,0,7,0,4},
                       {0,7,0,0,0,0,0,0,0}};

    print_sudo(sudo);
    sudo_solver(sudo);

    return 0;
}

void sudo_solver(char sudo[9][9]) {
  int z, s;
  char i;
  if(suche_leer(sudo, &z, &s)) {
    for (i=1; i<=9; i++) {
      sudo[z][s] = i;
      if (check_sudo(sudo, z, s)) {
        sudo_solver(sudo);
      }
    }
    sudo[z][s] = 0;
  } else {
    print_sudo(sudo);
  }
}

int suche_leer(char sudo[9][9], int *z, int *s) {
  for(*z = 0; *z<9; (*z)++) {
    for(*s = 0; *s<9; (*s)++) {
      if (sudo[*z][*s] == 0)
        return 1;
    }
  }
  return 0;
}

int check_sudo(char sudo[9][9], int z, int s) {
  int i, j, x, y;
  for (i=0; i<9; i++) {
    if (sudo[z][i] == sudo[z][s] && s!=i) {
      return 0;
    }
  }
  for (i=0; i<9; i++) {
    if (sudo[i][s] == sudo[z][s] && z!=i) {
      return 0;
    }
  }
  x = z/3;
  y = s/3;
  for (i=x*3; i<(x+1)*3; i++) {
    for (j=y*3; j<(y+1)*3; j++) {
      if (sudo[i][j] == sudo[z][s] && z!=i && s!=j) {
        return 0;
      }
    }
  }
  return 1;
}

void print_sudo(char sudo[9][9]) {
  int i, j;
  printf("Sudoku:\n");
   for(i = 0; i<9; i++) {
    for(j = 0; j<9; j++) {
      printf("%3d", sudo[i][j]);
    }
    putchar('\n');
  }
  putchar('\n');
}
