class Minister
{
static void serve()
{
System.out.println("running serve in Minister");
Assistant.help();
}

}
class Assistant
{
	static void help()
	{
		System.out.println("running help in assistant");
		Driver.drive();
	}
}
class Driver
{
	static void drive()
	{
		System.out.println("running drive in driver");
		Vehicle.transport();
	}
}
class Vehicle
{
static void transport()
{
System.out.println("running transport in vehicle");
MusicSystem.play();
}

}class MusicSystem
{
static void play()
{
System.out.println("running play in MusicSystem");
Application.run();
}

}class Application
{
static void run()
{
System.out.println("running run in Application");
Internet.stream();
}

}class Internet
{
static void stream()
{
System.out.println("running stream in Internet");
Server.connect();
}

}class Server
{
static void connect()
{
System.out.println("running connect in Server");
Location.display();
}

}class Location
{
static void display()
{
System.out.println("running display in Location");
Building.openGate();
}

}class Building
{
static void openGate()
{
System.out.println("running openGate in Building");
Metal.strength();
}

}class Metal
{
static void strength()
{
System.out.println("running strength in Metal");
Factory.make();
}

}class Factory
{
static void make()
{
System.out.println("running make in Factory");
Machine.design();
}

}class Machine
{
static void design()
{
System.out.println("running design in Machine");
Engineer.nothing();
}

}class Engineer
{
static void nothing()
{
System.out.println("running nothing in Engineer");

}

}
