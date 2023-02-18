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

-->[Geeks for Geeks/Reader and Writers problem](https://www.geeksforgeeks.org/readers-writers-problem-set-1-introduction-and-readers-preference-solution/) 

*(this is the generic solution to avoid the conflict between our solution and the declared above and it tests differnt circumstences)*

***(the genreric solution is more trusted for the educational purposes, for us we developed our own solution based on our vision and 
understanding of problem nature and the real-world application itself.)***

## The Project Idea
the idea was very basic and, really interesting, in the most reservation we need to gurantee the system has a huge number of users to insert their data and book tickets.
they need to login and then start to reserve the flight for the chosen place we cutted down the system in the moment that the requestes are sent (reservation requests) 
we skipped all the other processes before this like logining in, filling the data fields, and choosing the flight destination all were pre-built inside the classes
we were working on making the solution has some kind of ***(Randomness Factor)*** like the Names, Phone numbers, Tickets, and intialized a set of randomizers to generate or 
pick data from the pre-defined data and create a single object refered to single Agent/Writer.

## Project components and structures
***The project used the standard components of JAVA and OOP dependent and also used MVC design pattern***

#### Componets :
1. Models
  - Flight,FlightDate
  - Passenger
  - Ticket
2. Views
  - Sadly we couldn't develop a GUI for this project
3. Controllers
  - FlightController
  - PassengerController
  - TicketController

## The Followed Premises for the buisness : (all real-life obstacles are NOT included)

### 1. The number of the reservers per person 
the approach that we followed, any person can reserve for a group or for himself and for this we build the system to cope up with this functionality, the agent
could reserve 1,2 or 3 seat/s in one single reservation ; ***(Randomizer)*** handled this task 
### 2. The Free number of seats is controlled the avilable seats are tested after each reservation process if the seats are not matched with the number of reservers
we were delaying the flight to the upcoming day, ( we assumed that it's the company responsability to avilability a new flight for the Agents )
and for this we were always intializing 2 flights to save the (current flight) and (delayed flight) conccurent flight reservation.

**(the solution for the real-world could not be the optimal one and we were considering that while designing because the AIM of the project is not developing the system but focuses more on applying the ***THREADs*** concept on the system)**
 ## Project Main Components
 ### 🔘 Randomizer
 The ***Randomizer*** one of the main components or i can say it's the ***Backbone*** of this project, it is the ***data generator*** and gurantee the variation of Agents/Writers Data the ***Randomizer*** was simulating the process of loginning, filling out the data and related stuff becuase we were out of data and we wanted to generate ours *randomly*
 
  ***Randomizer work idea*** : the ***Randomzier*** nothing more than method that manipulates a *Range of number or a fixed array* the array could represents the *pre-defined names or phone numbers* **(check out the ***Models*** package to get more infos.)** the range of numbers could be represented in **Ticket ID** we determined a specific range to our ***Tickets*** and the ***randomizer*** assign a ticket for each Client/Writer.
 
 *(we solved the multiple assignment by increasing the range of ticket inclusion where the redundancy could be minimum as possible)*
 
 ### 🔘 Semaphore
 Semaphore is a well-known solution *(technique)* for solving concurrency related problems ***semaphore*** controlling the threads.
 by organizing the access for multiple threads for a single resource ***(critcal section)*** by intializing the semaphore it requests a permit to access this ***critical section*** using two main methods : 
 1. **signal()** *(to notify the next thread that the current thread had left the ***critical section***)* 
 2. **wait()** *(to notify the next thread their is a currently using the critical section ***critical section***)*
 
 in our problem representation we did the same thing to our reservee every Agent was entering the ***critical section*** was notifying all the waiting *threads* to wait using ***wait()*** function, when it leaves notify all the waiting *threads* using ***signal()***  to let a new thread comes in to the ***critical section*** 

***Critical Section*** = **a reservation process for each reservee**

*(to read mora about the ***Semaphore*** please check the link below)*
 
 --> [Wikipedia/Semaphore in Programming](https://en.wikipedia.org/wiki/Semaphore_(programming))
 
 ### Project 
 for next update
 + project expexted updates and falses.
 + discuss the importance of choosing semaphore on synchronized method
