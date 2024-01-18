interface InterfaceElektronik {
    void on();
    void off();
}

interface InterfaceChannelTV extends InterfaceElektronik {
    void gantiChannel(int c);
}

interface InterfaceChannelRadio extends InterfaceElektronik {
    void gantiChannel(int c);
}

class Radio implements InterfaceChannelRadio {
    private boolean mesin;
    private int volume;

    public Radio() {
        this.mesin = false;
        this.volume = 0;
    }

    @Override
    public void on() {
        mesin = true;
        System.out.println("Radio is turned on.");
    }

    @Override
    public void off() {
        mesin = false;
        System.out.println("Radio is turned off.");
    }

   @Override
   public void gantiChannel(int c) {
       if (mesin) {
           System.out.println("Switching to channel " + c);
       } else {
           System.out.println("Please turn on the radio first.");
       }
   }

   public void perbesarVolume() { 
       volume++;
       System.out.println("Volume increased to " + volume);
   }

   public void perkecilVolume() { 
       if (volume > 0) volume--;
       System.out.println("Volume decreased to " + volume);
   }
}

class Televisi implements InterfaceChannelTV{
     private boolean mesin, listrik; 
     private String merk; 

     Televisi(String merk){
         this.merk=merk; 
         this.mesin=false; 
         this.listrik=true; //assuming there's electricity when TV is bought or initialized.
     } 

     @Override
     public void on(){
         if(listrik){
             mesin=true; 
             System.out.println(merk+" TV is ON");
         }else{
             System.out.println(merk+" TV can't be switched ON due to no electricity");
         }
         
     } 

     @Override
     public void off(){
          mesin=false; 
          System.out.println(merk+" TV is OFF");
      } 

      @Override
      public void gantiChannel(int c){
          if(mesin){
              //assuming channel switching logic here.
              //for simplicity printing it in console.
              System.out.println(merk+" TV switched to channel "+c);
          }else{
              System.out.println("Please turn on the TV first.");
          }
      }
}

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        Televisi televisi = new Televisi("Samsung");

        radio.on();
        radio.gantiChannel(1);
        radio.perbesarVolume();
        radio.perkecilVolume();
        radio.off();

        televisi.on();
        televisi.gantiChannel(2);
        televisi.off();
    }
}
