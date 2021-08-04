# demo.Api
******************************************************

28 July, 2021

Demo Apis, create an api which just return a String;
Using 8080 port http;
******************************************************

30 July, 2021

Using [8081] port http;
Convert the Bank project to Api with followed functions:

1. addAccount (by Using PostMapping)
2. updateName (by Using PutMapping)
3. deleteAccount  (by Using DeleteMapping)
4. getAccount (by Using GetMapping)

Editted some DAO class method for better using 
such as update name and add account and delete account;

******************************************************
1 Aug, 2021

All the bank methods are added and tested

******************************************************
3 Aug, 2021

Using JPA default CRUD methods and don't need DAO class anymore

Tested by using h2.console database, will connect to AWS database later

DAO version is in seperated folder from JPA version;
