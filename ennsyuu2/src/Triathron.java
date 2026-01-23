public class Triathron {
    
private String name;
private double swim;
private double bike;
private double run;

public Triathron(){}

public Triathron(String name,double swim,double bike,doublerun){


this.name=name;
this.swim=swim;
this.bike=bike;
this.run=run;
}

@Override
public String toString({
    return "Triathlon [name="+name+"+swim="+swim+"、bike="+bike+",run="+run+"]";
}
}
