# OS-2_Project - (Readers and Writers Problem)
Os-2 project built to solve Readers&Writers Problem using Synchronization tools.
in this project we were working on the "Readers and writers Problem" using a real-world application ***"An airline reservation system" using multithreaded approach***;
that gurantee to satisfy the 3 main testing approaches: ***Mutual-exclusion, Progress and, bounding-waiting.***
 
### Problem nature circumstances :
1. No two Writers are allowed to WRITE at the same time. [Mutual-Exclusion].
2. The Reader/s aren't allowed to read until the Writers finish the process of writing to not fall in flase-data or temp-data.
3. Reader/s can do both operations _READ_ and _WRITE_ after assuring that the all **Writers** finished the process of writing.

-- *all the special cases as (Starvation or Deadlock) got handled due to problem nature in the normal test of the process the critical section getting accessed based on.*

*the base solution and for more refrences we recommend to check the link below :*

-->[Reader and Writers problem/Geeks for Geeks](https://www.geeksforgeeks.org/readers-writers-problem-set-1-introduction-and-readers-preference-solution/) 

*(this is the generic solution to avoid the conflict between our solution and the declared above and it tests differnt circumstences)*

***(the genreric solution is more trusted for the educational purposes, for us we developed our own solution based on our vision and 
understanding of problem nature and the real-world application itself.)***

## The Project Idea
the idea was very basic and, really interesting, in the most reservation we need to gurantee the system has a huge number of users to insert their data and book tickets.
they need to login and then start to reserve the flight for the chosen place we cutted down the system in the moment that the requestes are sent (reservation requests) 
we skipped all the other processes before this like logining in, filling the data fields, and chooing the flight destination all were pre-built inside the classes
we were working on making the solution has some kind of ***(Randomness Factor)*** like the Names, Phone numbers, Tickets, and intialized a set of randomizers to generate or 
pick data from the pre-defined data and create a single object refered to single Agent/Writer.

## Prpject components and structures
***the project used the standard components and 

## The followed approaches to  :

### 1. The number of the reservers per person 
the approach that we followed, any person can reserve for a group or for himself and for this we build the system to cope up with this functionality, the agent
could reserve 1,2 or 3 seat/s in one single reservation ; ***(Randomizer)*** handled this task 
### 2. The Free number of seats is controlled the avilable seats are tested after each reservation process if the seats are not matched with the number of reservers
we were delaying the flight to the upcoming day, ( we assumed that it's the company responsability to avilability a new flight for the Agents )
and for this we were always intializing 2 flights to save the (current flight) and (delayed flight) conccurent flight reservation.
