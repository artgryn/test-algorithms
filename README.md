## Test 2 different algorithms


### 1. Find first duplicate 
Check an array for duplicates and return it otherwise return -1
Approach: for this task best to use classic for-loop and 'Set'. 
'Set' contains only unique values and in a case of adding 'Set.add()' duplicated value to the Set a'Set.add()' will return FALSE.


### 2. Check if string balanced
Check input string for balancing
For that logic best to use Java tooling. ReplaceAll for String object.
1. Check does string contains any [], {}, ()
2. Remove all [], {}, ()
3. If String not empty and do not contains [], {}, () return FALSE otherwise repeat (2)



## How to run?
By the default service executed on port `8080`
```
./gradlew bootRun
```

Current service contains 2 POST end-points. To check algorithms
1. `/duplicates` - find first duplicate in the array
```
curl --location --request POST 'http://localhost:8080/duplicates' \
--header 'Content-Type: application/json' \
--data-raw '{
    "duplicatesCheck": [22, 1, 31, 5, 3, 2, -5]
}'
```

2 `/balanced` - find does string balanced or not
```
curl --location --request POST 'http://localhost:8080/balanced' \
--header 'Content-Type: application/json' \
--data-raw '{
    "stringForBalanceCheck": "[(){}()]"
}'
```