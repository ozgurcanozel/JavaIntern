public class Car {
    // arabada degistirilemez  ozellikler : motor gucu, motor, speed

        private int enginePower, model;

        int speed; // public yazmasakta default olarak public kadar genis olmasa da public olarak gelir

        protected String color; // sadece bu package icinde ve bu sinif icindeki kavramlar erisebiliyor

        Car(){
                this.model = 2020;
                this.enginePower = 300;
                this.speed = 120;
                this.color = "Kirmizi";

        }

        // bu bir method yazmaktir

//        public void print(){
//                System.out.println(model);
//        }

        // bu methodu direkt olarak cagiramayiz ama asagida tanimladigim run ile direkt package baslatildiginda calisiyor ama print() fonksiyonunu cagiramayiz
        private void print(){
                System.out.println(model);
        }
        public void run(){
                print();
        }

}

