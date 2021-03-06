package myPackage;

public class Reflector extends Rotor {

    private int[] selectedMapping;
    public Reflector(int mappingType){

        if(mappingType==1) {
            this.initialise("ReflectorI");
            this.selectedMapping =new int[] { 24, 17, 20, 7, 16, 18, 11, 3, 15, 23, 13, 6, 14, 10, 12, 8, 4 , 1, 5, 25, 2, 22, 21, 9, 0, 19 };
        }
        else if(mappingType==2){
            this.initialise("ReflectorII");
            this.selectedMapping=new int[] { 5, 21, 15, 9, 8, 0, 14, 24, 4, 3, 17, 25, 23, 22, 6, 2, 19, 10, 20, 16, 18, 1, 13, 12, 7, 11 };
        }
    }
    @Override
    public void initialise(String name) {
       this.name=name;
    }

    @Override
    public int substitute(int position) {
            for(int i=0;i<this.selectedMapping.length;i++){
                if(this.selectedMapping[i]==position)
                    return i;

            }
            return -1;
    }
}
