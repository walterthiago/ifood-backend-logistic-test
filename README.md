# iFood Backend Test - Logistic - Vehicle Routing Problem

You have been hired to create a completely new micro-service to route orders minimizing overall distance. This problem is well known as Vehicle Routing Problem, please find a reference for it at (https://en.wikipedia.org/wiki/Vehicle_routing_problem). 
Your micro-service must provide us an endpoint which receives orders identified by geo-location of the restaurant and the client (lat,long).
The order also has the pickup time (the moment when the dish is ready) and a delivery time (due time to deliver the dish).

Json example:
```json
{ "orders": [  
     { 
        "id": 1 
        "restaurant":{ "lat" : "0.0", "lng" : "0.0"},
        "client":{ "lat" : "1.0", "lng" : "1.0"},
        "pickup":"13:37",
        "delivery":"13:54"
     },
     ...
   ]
}
```
_* This example ilustrates the problem. Please, use the right types for the attributes._

This service must return the solution proposed following the example below.
```json
{
	"routes": [
		{
			"orders": [1, 2, 5]
		}
		{
			"orders": [3]
		}
	]
}
```
_* Same consideration.
The ids are the orders that are picked and delivered in one route by a driver._


## You must consider that:

- You have limitless drivers.
	-> but it is better to minimize the number of drivers.
- A worker can do at most 3 deliveries at the same time (i.e. in the same route)
- You CAN'T deliver an order after the delivery time
- You CAN'T pick up an order before the pickup time
- The driver is on the restaurant at the pickup time
- Consider that the driver goes 0.1 units in line each 5 minute.

Hints: your system is growing and the constraints can change, furthermore, new constraints can be added. Prepare your system to be easy to change/configure and easy to add new constraints.

## Non-functional requeriments

Now consider that your micro-services are a success inside IFood, it must be prepared to be fault tolerant, responsive and resilient.

Use whatever tools and frameworks you feel comfortable with, and briefly elaborate on your solution, architecture details, choice of patterns and frameworks.
	**The only restriction is to use Java.**

Also, make it easy to deploy/run your service(s) locally (consider using some container/vm solution for this). Once done, share your code with us.
