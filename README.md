﻿# EnigmaMachine
   Basic Engima Machine simulator<br/>
## How does it work
### Using Main Method
        EnigmaMachine EM=new EnigmaMachine();<br/>
        EM.addPlug('Q','F');(you can add up to 13 plugs without duplication<br/>
        There are 5 Kind of Rotors<br/>
        I,II,III,IV,V  (passed the type when Initiating the rotor)<br/>
        TurnoverRotor Rotor1=new TurnoverRotor("I");<br/>
        Rotor1.setPosition(23);
        EM.addRotor(Rotor1,0);
        TurnoverRotor Rotor2=new TurnoverRotor("II");
        Rotor2.setPosition(11);
        EM.addRotor(Rotor2,1);
        Rotor1.setNextRotor(Rotor2);
        TurnoverRotor Rotor3=new TurnoverRotor("III");
        Rotor3.setPosition(7);
        EM.addRotor(Rotor3,2);
        Rotor2.setNextRotor(Rotor3);
        Reflector RE=new Reflector(1);
        EM.setReflector(RE);

        //OJVAYFGUOFIVOTAYRNIWJYQWMXUEJGXYGIFT
      //THE QUICK BROWNFOXJUMPED OVER THE LAZY DOG  (Without Spaces)
        System.out.println(EM.start(("OJVAYFGUOFIVOTAYRNIWJYQWMXUEJGXYGIFT").toUpperCase()));
   
   
