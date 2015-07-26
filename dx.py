# DeltaX internship question
m=input("Enter the m");
n=input("Enter the n");
list1=range(1,n+1);

i=0;leng=len(list1);
while leng>1:
	i=(i+(m-1))%(leng);
	list1.remove(list1[i]);
	leng=len(list1);

print  "Winner",list1[0];