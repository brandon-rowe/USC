import java.util.*;
import java.io.*;

public class bulb{
   
   boolean light = false;
   String check = "";
   
   public boolean lightOn(){
      light = true;
      return light;
   }
   public boolean lightOff(){
      light = false;
      return light;
   }
   public String checkLight(){
      if (light==true)
      {
         check = "The light is on.";
      }
      else
      {
         check = "The light is off.";
      }
      return check;
   }

}