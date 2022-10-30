/* tslint:disable */
/* eslint-disable */
// Generated using typescript-generator version 3.0.1157 on 2022-10-08 22:08:14.

export interface UserDTO {
    aktualisJelenetName: string;
    inventory: string[];
    jelenetVerziok: { [index: string]: number };
    userName: string;
    password: string;
}

export interface JelenetDTO {
    id: number;
    szoveg: string;
    search: SearchDTO;
    wait: WaitDTO;
    invalidDirs: string[];
    invalidDirsText: string;
    validDirs: ValidDirsDTO[];
    visitedSzoveg: string;
}

export interface SearchDTO {
    szoveg: string;
    item: string;
}

export interface ValidDirsDTO {
    name: string;
    goToJelenet: number;
}

export interface WaitDTO {
    szoveg: string;
    goToJelenet: number;
    dead: boolean;
}

export interface ItemetHasznalDTO {
    actualisJelenetID: number;
    selectedItemName:  string;
}

export interface ItemDTO {
    name:          string;
    gotoJelenetID: number;
    text:          string;
    used:          boolean;
}


