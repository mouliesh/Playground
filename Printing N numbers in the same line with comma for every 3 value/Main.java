#include <stdio.h>
int main()
{
	int n;
  scanf("%d",&n);
  for(int num=1;num<=n;num++)
  {
    printf("%d",num);
    if((num % 3==0) && (num != 0))
    {
      printf(",");
    }
  }
	return 0;
}