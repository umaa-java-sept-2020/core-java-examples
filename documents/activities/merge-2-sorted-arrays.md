### INSERTION SORT

2 5 7 15 20 24

condition is: to place my input(number) you are allowed to remove last/first element.
replace at last number: 10

2 5 7 15 20 10

2 5 7 15 10 20

2 5 7 10 15 20
=======================================

relace at first number: 17
2 5 7 15 20 24

17 5 7 15 20 24

5 17 7 15 20 24

5 7 17 15 20 24

5 7 15 17 20 24
=======================================

### Merge Below Two Sorted Arrays

arr1 = {2, 5, 10, 15, 20}
arr2 = {10, 12, 13}
===============================

answer
2, 5, 10, 10, 12, 13, 15, 20 (not this one, below one)

arr1= 2, 5, 10, 10, 12
arr2 = 13, 15, 20
===============================

arr1 = {2, 5, 10, 15, 20}
arr2 = {10, 12, 13}


{
int v1 = 20 last element of arr1
int v2 = 10 first element of arr2

while(true){
    if(v1 <= v2) break;
	insertV1AtFirst(arr2, v1);
	insertV2AtLast(arr1, v2);
	v1 = ? last element of arr1
	v2 = ? first element of arr2
}
}



