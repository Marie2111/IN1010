class Lege implements Comparable<Lege>{
  String navn;
  Liste<Resept> utskrevneResepter = new Lenkeliste<Resept>();

  public Lege(String navn){
    this.navn = navn;
  }

  public String henteNavn(){
    return this.navn;
  }

  @Override
  public int compareTo(Lege annenLege){
    return (this.navn.compareTo(annenLege.henteNavn()));
  }

  public void skrivResept(Resept x){
    this.utskrevneResepter.leggTil(x);
  }

  public Liste hentUtskrevneResepter(){
    return this.utskrevneResepter;
  }
}
