# ClinividAssignment
Problem Statement:
In some cases the browser doesn't support JavaScript so we end up sending the profile data as
the following query string:
new_profile|siret87324sd1232|<Aamir><Hussain><Khan>|14-03-1965|<Mumbai><<72.87
2075><19.075606>>,<Delhi><<23.23><12.07>>|siret87324sd1232.jpg
Your task is to generate the JSON by parsing the above query string, it should look like same as
the JSON mentioned in the question.
Some examples of the query string:
Ex1 :
new_profile|jkdfgkjie9ir9977|<Amit><><Singh>||<Delhi><<><>>|jkdfgkjie9ir9977.j
pg

Solution:
-A Restfull webservice is created
-Run MainApplication.java as Java Application.
-url: http://localhost:8080/rest/getJson 
-By using POST method pass text string with body content type as text/plain
