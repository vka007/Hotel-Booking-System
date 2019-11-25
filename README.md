# Hotel-Booking-System

Steps to Access Project: Coming Soon!

Project Requirement & Deliveriables:

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
