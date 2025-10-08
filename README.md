## Structural Design Patterns: Facade

---

# Challenge
Let's have a look at our next challenge exercise. This is an app that simulates driving a car, with a manual gear box. It's quite a simplistic representation, to keep this exercise simple. And you don't need to know anything at all about how a car works in real life, to do this one. There are classes each of the components needed for driving a car. 

Called accelerator, clutch, gear stick, hand brake, and ignition. They all have methods that simulates there functionality, in a real car. For example, in the accelerator class, there are methods called press and lift. And these just print out messages to the console saying, what's happening. So, for example, the press method says, "Pressing accelerator down." 

In the car class, there is a main method. In here I've created an object for each of the components. And then, underneath I've called the methods in the order they are needed, to drive a car. If I run the app. I can see it print out in the console, the different steps, such as, turning the ignition on, pressing the clutch down, changing to gear one, and so on. 

This exercise is to create a facade class, so that the functionality, for driving the car, is moved out of the car class. Good luck, and have fun.