package generics;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        League<Team<SoccerPlayer>> pl = new League<>("Premier League");
        League<Team<FootballPlayer>> nfl = new League<>("National Football League");
        League<Team<BaseballPlayer>> mlb = new League<>("Major League Baseball");

        Team<SoccerPlayer> chelsea = new Team<>("Chelsea");
        Team<SoccerPlayer> liverpool = new Team<>("Liverpool");
        Team<SoccerPlayer> manchesterUnited = new Team<>("Manchester United");
        Team<SoccerPlayer> manchesterCity = new Team<>("Manchester City");

        Team<FootballPlayer> newEnglandPatriots = new Team<>("New England Patriots");
        Team<FootballPlayer> dallasCowboys = new Team<>("Dallas Cowboys");
        Team<FootballPlayer> philadelphiaEagles = new Team<>("Philadelphia Eagles");
        Team<FootballPlayer> kansasCityCheifs = new Team<>("Kansas City Cheifs");

        Team<BaseballPlayer> newYorkYankees = new Team<>("New York Yankees");
        Team<BaseballPlayer> philadelphiaPhillies = new Team<>("Philadelphia Phillies");
        Team<BaseballPlayer> chicagoCubs = new Team<>("Chicago Cubs");
        Team<BaseballPlayer> losAngelesDodgers = new Team<>("Los Angeles Dodgers");

        System.out.println("Premier League:");

        pl.addTeam(chelsea);
        pl.addTeam(liverpool);
        pl.addTeam(manchesterUnited);
        pl.addTeam(manchesterCity);

        chelsea.matchResult(liverpool, 2, 1);
        chelsea.matchResult(manchesterUnited, 3, 2);
        chelsea.matchResult(manchesterCity, 4, 3);
        liverpool.matchResult(chelsea, 0, 0);
        liverpool.matchResult(manchesterUnited, 1, 0);
        liverpool.matchResult(manchesterCity, 2, 0);
        manchesterUnited.matchResult(chelsea, 2, 1);
        manchesterUnited.matchResult(liverpool, 0, 2);
        manchesterUnited.matchResult(manchesterCity, 0, 1);
        manchesterCity.matchResult(chelsea, 2, 1);
        manchesterCity.matchResult(manchesterUnited, 2, 3);
        manchesterCity.matchResult(liverpool, 3, 2);

        System.out.println();
        pl.showLeagueTable();
        System.out.println();
        System.out.println("National Football League:");

        nfl.addTeam(newEnglandPatriots);
        nfl.addTeam(dallasCowboys);
        nfl.addTeam(philadelphiaEagles);
        nfl.addTeam(kansasCityCheifs);

        newEnglandPatriots.matchResult(dallasCowboys, 41, 26);
        newEnglandPatriots.matchResult(philadelphiaEagles, 37, 31);
        newEnglandPatriots.matchResult(kansasCityCheifs, 13, 32);
        dallasCowboys.matchResult(newEnglandPatriots, 10, 20);
        dallasCowboys.matchResult(philadelphiaEagles, 39, 35);
        dallasCowboys.matchResult(kansasCityCheifs, 5, 20);
        philadelphiaEagles.matchResult(newEnglandPatriots, 38, 7);
        philadelphiaEagles.matchResult(dallasCowboys, 18, 24);
        philadelphiaEagles.matchResult(kansasCityCheifs, 39, 40);
        kansasCityCheifs.matchResult(newEnglandPatriots, 20, 31);
        kansasCityCheifs.matchResult(dallasCowboys, 20, 6);
        kansasCityCheifs.matchResult(philadelphiaEagles, 30, 17);

        System.out.println();
        nfl.showLeagueTable();
        System.out.println();
        System.out.println("Major League Baseball:");

        mlb.addTeam(newYorkYankees);
        mlb.addTeam(philadelphiaPhillies);
        mlb.addTeam(chicagoCubs);
        mlb.addTeam(losAngelesDodgers);

        newYorkYankees.matchResult(philadelphiaPhillies, 8, 15);
        newYorkYankees.matchResult(chicagoCubs, 4, 4);
        newYorkYankees.matchResult(losAngelesDodgers, 3, 6);
        philadelphiaPhillies.matchResult(newYorkYankees, 4, 3);
        philadelphiaPhillies.matchResult(chicagoCubs, 9, 5);
        philadelphiaPhillies.matchResult(losAngelesDodgers, 4, 7);
        chicagoCubs.matchResult(newYorkYankees, 3, 9);
        chicagoCubs.matchResult(philadelphiaPhillies, 8, 0);
        chicagoCubs.matchResult(losAngelesDodgers, 1, 9);
        losAngelesDodgers.matchResult(newYorkYankees, 2, 5);
        losAngelesDodgers.matchResult(chicagoCubs, 3, 3);
        losAngelesDodgers.matchResult(philadelphiaPhillies, 7, 2);

        System.out.println();
        mlb.showLeagueTable();
    }
}
