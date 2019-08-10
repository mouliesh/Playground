#include <stdio.h>
int main()
{
	int n;
  scanf("%d",&n);
  int num = 0;
  for(int row = 1; row<=n;row++)
  {
    for(int col = 1;col<=row;col++)
    if(num == 0)
    {
      printf("*");
      num = 1;
    }
     else
     {
       printf("#");
       num = 0;
     }
    printf("\n");
  }
  	return 0;
}