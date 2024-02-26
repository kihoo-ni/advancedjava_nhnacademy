public class Unit {
        protected int hp;
        protected int location;
        protected int attackPower;
     
        public int getHp(){
         return this.hp;
        }
     
        public int getLocation(){
         return this.location;
        }
     
        public int getAttackPower(){
         return this.attackPower;
        }
     
        public void reduceHp(int attackPower){
         this.hp-=attackPower;
        }
     
        public void move(int location){
         this.location=location;
        }
     
        public void attack(Unit unit){
         System.out.println("공격");
         unit.reduceHp(this.getAttackPower());
        }
     
      
     }
     
     
     
