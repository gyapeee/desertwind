export  enum Direction{
      Észak = 1,
      Dél = 2,
      Kelet = 3,
      Nyugat = 4


  }
  
  export class DirectionUtil{
    public static directionByName(name: string): number{
        switch(name){
          case Direction[1]:
            return Direction.Észak;
          case Direction[2]:
            return Direction.Dél;
          case Direction[3]:
            return Direction.Kelet;
          case Direction[4]:
            return Direction.Nyugat;
          default:
            return -1;
        }
      }
  }
