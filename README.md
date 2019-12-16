# Hotel-Booking-System

## Requirements

- MongoDB, IDE, Postman or Web Browser & Codes

## Installation

- All the `code` required to get started
- Install `MongoDB` to local system. Thats it.
  
- Use the link to Download the Mongo Community Server i.e MongoDB: 

  https://www.mongodb.com/download-center/community?jmp=docs
  			or Direct Download
  https://fastdl.mongodb.org/win32/mongodb-win32-x86_64-2012plus-4.2.2-signed.msi

After installation, Open cmd/powershell and start Mongo Server. 
- Type Command-> `mongo`	
Minimize the cmd window. 
  	
### Clone

- Clone this repo to your local machine using `https://github.com/vka007/Hotel-Booking-System`

### Setup & Run

- There are total 4 Microservice with each functionality and tasks.
- Open the Microservices in any IDE i.e STS or Intellij etc.
- Make sure Mongo is running in backround. You dont need to configure the Database sepearately.
- Now goto `hotel` package of each microservice, and run the Java Application as Spring Boot.
 ` Ex. BookingManagerMicroserviceApplication.java -> Right Click -> Run as -> Spring Boot App `
- Run all the 4 microservices similarly. It will run on seperate Ports. Done!
- Now lets make some BOOKINGSSS!

> API Endpoints & Ports:

- Common API Endpoints : /create, /get, /getAll, /update, /delete, /deleteAll, /priceList
- Port Numbers : 8080, 8081, 8082, 8083

> Sample Commands for quick Testing:

- Use Postman or Chrome

- Hotel Details Microservice
1) http://localhost:8080/create?name=The Taj Grand&address= 41/3 MG Road&city=Bangalore&state=Karnatak&country=India&zipCode=560001&phoneNumber=8066604444&email=contact@taj.com
2) http://localhost:8080/create?name=Marriot International&address= Koramangala&city=Bangalore&state=Karnatak&country=India&zipCode=560045&phoneNumber=9855504444&email=contact@marriot.com
3) http://localhost:8080/get?name=The Taj Grand
4) http://localhost:8080/update?name=The Taj Grand&address= 63/4 Near MG Road&city=Bangalore&state=Karnatak&country=India&zipCode=560001&phoneNumber=8066601111&email=contactus@taj.com
5) http://localhost:8080/delete?name=The Taj Grand
6) http://localhost:8080/deleteAll

- Room Manager Microservice
1) http://localhost:8081/create?roomName=A001&roomType=DeluxeAC
2) http://localhost:8081/create?roomName=A202&roomType=SuperDeluxe
3) http://localhost:8081/get?roomName=A202
4) http://localhost:8081/update?roomName=A001&roomType=Suites
5) http://localhost:8081/getAll
6) http://localhost:8081/delete?roomName=A202
7) http://localhost:8081/deleteAll

- Price List Microservice
1) http://localhost:8082/create?roomType=Suites&roomPrice=1200
2) http://localhost:8082/create?roomType=SuperDeluxe&roomPrice=800
3) http://localhost:8082/get?roomType=SuperDeluxe
4) http://localhost:8082/update?roomType=Suites&roomPrice=1500
5) http://localhost:8082/getAll
6) http://localhost:8082/delete?roomType=SuperDeluxe

- Booking Manager Microservice
1) http://localhost:8083/create?custFullName=Vineet Kumar Agrawal&custEmail=vineet@in.ibm.com&custPhone=7008672222&custUserId=vineet21&totalNights=4
2) http://localhost:8083/create?custFullName=Ankit Jain&custEmail=Ankit1@gmail.com&custPhone=9908672233&custUserId=&totalNights=3
3) http://localhost:8083/get?custFullName=Vineet Kumar Agrawal
4) http://localhost:8083/update?custFullName=Vineet Kumar Agrawal&custEmail=vineet21@in.ibm.com&custPhone=7008673333&custUserId=vineet007&totalNights=5
5) http://localhost:8083/getAll
6) http://localhost:8083/priceList?roomType=Suites
7) http://localhost:8083/delete?custFullName=Vineet Kumar Agrawal
8) http://localhost:8083/deleteAll

## Postman Screenshot

- Quickly view all the API Request and responses. (Screenshots)
- Link: `https://drive.google.com/open?id=1m500sDVXm8MV22UbOycOR6_KTnPtfiDu`

Project Requirement & Deliverables:

Stack   Requirements 
 
- All   requests   should   be   handled   by   RESTful   API   (use   any   framework   you   like) 
- The   frontend   should   be   implemented   in   any   new   generation   js   framework   (e.g   VueJS, 
 AngularJS,   ReactJS)   as   a   SPA   application 
 
Admin   Dashboard 
  
1.1   Hotel   Details 
 
 
Fields: 
 -   Name 
 -   Address 
 -   City 
 -   State 
 -   Country 
 -   Zip   Code 
 -   Phone   Number 
 -   Email 
 -   Image 
  
Functionality: 
 -   ability   to   retrieve   hotel   details 
 -   ability   to   edit   hotel   details 
 -   the   system   should   store   only   one   single   hotel   (it   can   be   seeded) 
 
 
1.2   Room   Manager 
 
 
Fields: 
 -   Room   Name   (e.g.   A1,B2,   C4) 
 
-   Hotel   Id   (relational   field) 
 -   Room   Type   (relational   field) 
 -   Room   Image 
 
 
Functionality: 
 -   crud   actions   for   room   manager 
 
 
Note: 
 -   All   required   fields   should   be   validated 
 
 
1.3   Room   Type   Manager 
 
 
Fields: 
 -   Room   Type   Name   (e.g.   Deluxe,   Standard) 
   
Functionality: 
 -   crud   actions   for   room   type   manager 
 
 
Note: 
 -   All   required   fields   should   be   validated 
 
 
1.4   Price   List   Manager 
 
 
Fields: 
 You   are   free   to   structure   the   fields 
 
 
Functionality: 
 -   Regular   Prices   (ability   to   define   prices   for   each   room   type) 
 -   It   should   provide   API   endpoints   for   crud 
 
 
Notes: 
 -   All   prices   should   be   in   USD 
 -   All   required   fields   should   be   validated 
 
 
1.5   Booking   Manager 
  
Fields: 
 -   Room   Id 
 -   Date   Start 
 -   Date   End 
 -   Customer   Fullname 
 -   Customer   Email 
 -   Customer   Phone 
 -   Total   Nights   (calculate   from   start   and   end   dates) 
 -   Total   Price   (should   display   price   based   on   the   condition   defined   in   Price   List   Manager   section) 
 -   User_id   (allow   nullable   value) 
 
 
Functionality: 
 -   Allow   crud   operations 
 -   Allow   viewing   bookings   in   calendar   mode   (calendar   should   be   filtered   by   month,   year   and 
 display   reserved   dates   with   booking   info   by   clicking   on   it) 
 
 
Note: 
 -   All   required   fields   should   be   validated   
 
The   application   stores   only   one   single   user   admin   which   should   be   seeded. 
 
 
RESULT: 
 
 
In   order   to   complete   this   task   follow   the   instructions   below: 
 
-   Create   a   private   git   repository   on   GitHub 
-   Share   access   with   github   user   :   xxxx 
 
Please   note   that   all   changes   should   be   committed   progressively.   One   big   commit   is   frowned 
 upon.   We   should   be   able   to   easily   see   the   parts   you   coded   and   differentiate   it   from   framework 
 code. 
 
NOTES: 
 
-   Create   DB   seeder   with   at   least   10   rooms   (make   sure   room   types   were   also   seeded) 
-   Create   DB   seeder   with   at   least   10   booking   records 
 
 
BONUS 
 -   Covering   code   with   unit   tests   and   adding   a   README   file   with   instructions   included   to   the   repo 
 will   be   of   great   help. 
 -   Setup   docker   to   build   &   run   code   and   share   the   same   in   readme   instructions. 
