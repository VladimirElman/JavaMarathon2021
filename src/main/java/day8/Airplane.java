package day8;

public class Airplane {
    String producer;
    int year;
    int length;
     int weight;
    int fuel = 0;



    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }
        public String toString(){
        return producer + "," + year + "," + length + "," + weight;
        }



    }

