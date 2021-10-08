# reactive-spring

Loadbalancer => buy more app instances => more cost


Questions:
Why do we have multiple app instances?
Why can't multiple users be served by a single app instance?

In the traditional approach:
The reason we can't have multiple instances and we loose the ability to handle multiple uses is we have limited number of threads

threads(n)=users(n)

Idea: Optimal use of the limited threads
	- better utilize the service waiting time 
		so other theads can reuse those threads


Target: Synchronous and blocking I/O
-Input-Output consumes the most time 
-We wait for the resouce to come to us over the network

Resolve: Asynchronous and non-blocking I/O
- Making the thread to only ask for the data and not wait to acquire it
- The data may return to the caller after an interrupt or callback


Hence:
- No use of java.util collections or Arrays, which are Synchronous and blocking, and are suitable for small amount of data
- Not suitable for large, latent ,asynchronous data 


Four interfaces of Reactive Stream
 - Publisher/Producer
 - Subscriber/Consumer
 - Subscription
 - Processor
