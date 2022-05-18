export enum Action{
    Várakozok = 1,
    Keresek =2,
    Használom = 3
}

export class ActionUtil{
    public static actionByName(name: string): number{
        switch(name){
          case Action[1]:
            return Action.Várakozok;
          case Action[2]:
            return Action.Keresek;
          case Action[3]:
            return Action.Használom;
          default:
            return -1;
        }
      }
  }