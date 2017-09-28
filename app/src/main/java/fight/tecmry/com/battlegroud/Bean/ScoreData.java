package fight.tecmry.com.battlegroud.Bean;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by Tecmry on 2017/9/23.
 */

public class ScoreData {


    /**
     * solo : [{"rating":"1,239","winrate":"0.00%","kill_deathratio":"0.36","rank":"#484,116","wins":"0","kills":"4","matchesplayed":"11","top10rate":"9.09%","avgdamagepermatch":"46.68","history":"[0,0,0,0,0,1239.791,1239.791]","versiondata":"2017-pre4","username":"tecmry"}]
     * duo : [{"rating":"1,189","winrate":"0.00%","kill_deathratio":"0.40","rank":"#1,103,077","wins":"0","kills":"4","matchesplayed":"10","top10rate":"0.00%","avgdamagepermatch":"62.96","versiondata":"2017-pre4","username":"tecmry","history":"[0,0,0,0,0,1189.729,1189.729]"}]
     * squad : [{"rating":"1,233","winrate":"0.00%","kill_deathratio":"0.00","rank":"#1,021,078","wins":"0","kills":"0","matchesplayed":"14","top10rate":"28.57%","avgdamagepermatch":"10.43","versiondata":"2017-pre4","username":"tecmry","history":"[0,0,0,0,0,1233.87,1233.87]"}]
     * union : [{"wins":"0","kill":"12","played":"46","playtime":"9h 37m","distance":"74 km","heals":"13","boosts":"22","acquired":"157","username":"tecmry"}]
     * username : [{"username":"tecmry","steamname":"tecmry6","username_avatar":"https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/fe/fef49e7fa7e1997310d705b2a6158ff8dc1cdfeb_full.jpg","serverdata":"sea,as","playnum":"35,11","historytime":"[\"17 Sep\",\"18 Sep\",\"19 Sep\",\"20 Sep\",\"21 Sep\",\"22 Sep\",\"23 Sep\"]","addtime":"2017-09-23 10:38:04"}]
     * currentserver : sea
     * servermatches : 35
     * serverarray : ["sea","as"]
     */

    private String currentserver;
    private String servermatches;
    private List<SoloBean> solo;
    private List<DuoBean> duo;
    private List<SquadBean> squad;
    private List<UnionBean> union;
    private List<UsernameBean> username;
    private List<String> serverarray;

    public static ScoreData objectFromData(String str) {

        return new Gson().fromJson(str, ScoreData.class);
    }

    public String getCurrentserver() {
        return currentserver;
    }

    public void setCurrentserver(String currentserver) {
        this.currentserver = currentserver;
    }

    public String getServermatches() {
        return servermatches;
    }

    public void setServermatches(String servermatches) {
        this.servermatches = servermatches;
    }

    public List<SoloBean> getSolo() {
        return solo;
    }

    public void setSolo(List<SoloBean> solo) {
        this.solo = solo;
    }

    public List<DuoBean> getDuo() {
        return duo;
    }

    public void setDuo(List<DuoBean> duo) {
        this.duo = duo;
    }

    public List<SquadBean> getSquad() {
        return squad;
    }

    public void setSquad(List<SquadBean> squad) {
        this.squad = squad;
    }

    public List<UnionBean> getUnion() {
        return union;
    }

    public void setUnion(List<UnionBean> union) {
        this.union = union;
    }

    public List<UsernameBean> getUsername() {
        return username;
    }

    public void setUsername(List<UsernameBean> username) {
        this.username = username;
    }

    public List<String> getServerarray() {
        return serverarray;
    }

    public void setServerarray(List<String> serverarray) {
        this.serverarray = serverarray;
    }

    public static class SoloBean {
        /**
         * rating : 1,239
         * winrate : 0.00%
         * kill_deathratio : 0.36
         * rank : #484,116
         * wins : 0
         * kills : 4
         * matchesplayed : 11
         * top10rate : 9.09%
         * avgdamagepermatch : 46.68
         * history : [0,0,0,0,0,1239.791,1239.791]
         * versiondata : 2017-pre4
         * username : tecmry
         */

        private String rating;
        private String winrate;
        private String kill_deathratio;
        private String rank;
        private String wins;
        private String kills;
        private String matchesplayed;
        private String top10rate;
        private String avgdamagepermatch;
        private String history;
        private String versiondata;
        private String username;

        public static SoloBean objectFromData(String str) {

            return new Gson().fromJson(str, SoloBean.class);
        }

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public String getWinrate() {
            return winrate;
        }

        public void setWinrate(String winrate) {
            this.winrate = winrate;
        }

        public String getKill_deathratio() {
            return kill_deathratio;
        }

        public void setKill_deathratio(String kill_deathratio) {
            this.kill_deathratio = kill_deathratio;
        }

        public String getRank() {
            return rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }

        public String getWins() {
            return wins;
        }

        public void setWins(String wins) {
            this.wins = wins;
        }

        public String getKills() {
            return kills;
        }

        public void setKills(String kills) {
            this.kills = kills;
        }

        public String getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(String matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public String getTop10rate() {
            return top10rate;
        }

        public void setTop10rate(String top10rate) {
            this.top10rate = top10rate;
        }

        public String getAvgdamagepermatch() {
            return avgdamagepermatch;
        }

        public void setAvgdamagepermatch(String avgdamagepermatch) {
            this.avgdamagepermatch = avgdamagepermatch;
        }

        public String getHistory() {
            return history;
        }

        public void setHistory(String history) {
            this.history = history;
        }

        public String getVersiondata() {
            return versiondata;
        }

        public void setVersiondata(String versiondata) {
            this.versiondata = versiondata;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }

    public static class DuoBean {
        /**
         * rating : 1,189
         * winrate : 0.00%
         * kill_deathratio : 0.40
         * rank : #1,103,077
         * wins : 0
         * kills : 4
         * matchesplayed : 10
         * top10rate : 0.00%
         * avgdamagepermatch : 62.96
         * versiondata : 2017-pre4
         * username : tecmry
         * history : [0,0,0,0,0,1189.729,1189.729]
         */

        private String rating;
        private String winrate;
        private String kill_deathratio;
        private String rank;
        private String wins;
        private String kills;
        private String matchesplayed;
        private String top10rate;
        private String avgdamagepermatch;
        private String versiondata;
        private String username;
        private String history;

        public static DuoBean objectFromData(String str) {

            return new Gson().fromJson(str, DuoBean.class);
        }

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public String getWinrate() {
            return winrate;
        }

        public void setWinrate(String winrate) {
            this.winrate = winrate;
        }

        public String getKill_deathratio() {
            return kill_deathratio;
        }

        public void setKill_deathratio(String kill_deathratio) {
            this.kill_deathratio = kill_deathratio;
        }

        public String getRank() {
            return rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }

        public String getWins() {
            return wins;
        }

        public void setWins(String wins) {
            this.wins = wins;
        }

        public String getKills() {
            return kills;
        }

        public void setKills(String kills) {
            this.kills = kills;
        }

        public String getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(String matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public String getTop10rate() {
            return top10rate;
        }

        public void setTop10rate(String top10rate) {
            this.top10rate = top10rate;
        }

        public String getAvgdamagepermatch() {
            return avgdamagepermatch;
        }

        public void setAvgdamagepermatch(String avgdamagepermatch) {
            this.avgdamagepermatch = avgdamagepermatch;
        }

        public String getVersiondata() {
            return versiondata;
        }

        public void setVersiondata(String versiondata) {
            this.versiondata = versiondata;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getHistory() {
            return history;
        }

        public void setHistory(String history) {
            this.history = history;
        }
    }

    public static class SquadBean {
        /**
         * rating : 1,233
         * winrate : 0.00%
         * kill_deathratio : 0.00
         * rank : #1,021,078
         * wins : 0
         * kills : 0
         * matchesplayed : 14
         * top10rate : 28.57%
         * avgdamagepermatch : 10.43
         * versiondata : 2017-pre4
         * username : tecmry
         * history : [0,0,0,0,0,1233.87,1233.87]
         */

        private String rating;
        private String winrate;
        private String kill_deathratio;
        private String rank;
        private String wins;
        private String kills;
        private String matchesplayed;
        private String top10rate;
        private String avgdamagepermatch;
        private String versiondata;
        private String username;
        private String history;

        public static SquadBean objectFromData(String str) {

            return new Gson().fromJson(str, SquadBean.class);
        }

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public String getWinrate() {
            return winrate;
        }

        public void setWinrate(String winrate) {
            this.winrate = winrate;
        }

        public String getKill_deathratio() {
            return kill_deathratio;
        }

        public void setKill_deathratio(String kill_deathratio) {
            this.kill_deathratio = kill_deathratio;
        }

        public String getRank() {
            return rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }

        public String getWins() {
            return wins;
        }

        public void setWins(String wins) {
            this.wins = wins;
        }

        public String getKills() {
            return kills;
        }

        public void setKills(String kills) {
            this.kills = kills;
        }

        public String getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(String matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public String getTop10rate() {
            return top10rate;
        }

        public void setTop10rate(String top10rate) {
            this.top10rate = top10rate;
        }

        public String getAvgdamagepermatch() {
            return avgdamagepermatch;
        }

        public void setAvgdamagepermatch(String avgdamagepermatch) {
            this.avgdamagepermatch = avgdamagepermatch;
        }

        public String getVersiondata() {
            return versiondata;
        }

        public void setVersiondata(String versiondata) {
            this.versiondata = versiondata;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getHistory() {
            return history;
        }

        public void setHistory(String history) {
            this.history = history;
        }
    }

    public static class UnionBean {
        /**
         * wins : 0
         * kill : 12
         * played : 46
         * playtime : 9h 37m
         * distance : 74 km
         * heals : 13
         * boosts : 22
         * acquired : 157
         * username : tecmry
         */

        private String wins;
        private String kill;
        private String played;
        private String playtime;
        private String distance;
        private String heals;
        private String boosts;
        private String acquired;
        private String username;

        public static UnionBean objectFromData(String str) {

            return new Gson().fromJson(str, UnionBean.class);
        }

        public String getWins() {
            return wins;
        }

        public void setWins(String wins) {
            this.wins = wins;
        }

        public String getKill() {
            return kill;
        }

        public void setKill(String kill) {
            this.kill = kill;
        }

        public String getPlayed() {
            return played;
        }

        public void setPlayed(String played) {
            this.played = played;
        }

        public String getPlaytime() {
            return playtime;
        }

        public void setPlaytime(String playtime) {
            this.playtime = playtime;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public String getHeals() {
            return heals;
        }

        public void setHeals(String heals) {
            this.heals = heals;
        }

        public String getBoosts() {
            return boosts;
        }

        public void setBoosts(String boosts) {
            this.boosts = boosts;
        }

        public String getAcquired() {
            return acquired;
        }

        public void setAcquired(String acquired) {
            this.acquired = acquired;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }

    public static class UsernameBean {
        /**
         * username : tecmry
         * steamname : tecmry6
         * username_avatar : https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/fe/fef49e7fa7e1997310d705b2a6158ff8dc1cdfeb_full.jpg
         * serverdata : sea,as
         * playnum : 35,11
         * historytime : ["17 Sep","18 Sep","19 Sep","20 Sep","21 Sep","22 Sep","23 Sep"]
         * addtime : 2017-09-23 10:38:04
         */

        private String username;
        private String steamname;
        private String username_avatar;
        private String serverdata;
        private String playnum;
        private String historytime;
        private String addtime;

        public static UsernameBean objectFromData(String str) {

            return new Gson().fromJson(str, UsernameBean.class);
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getSteamname() {
            return steamname;
        }

        public void setSteamname(String steamname) {
            this.steamname = steamname;
        }

        public String getUsername_avatar() {
            return username_avatar;
        }

        public void setUsername_avatar(String username_avatar) {
            this.username_avatar = username_avatar;
        }

        public String getServerdata() {
            return serverdata;
        }

        public void setServerdata(String serverdata) {
            this.serverdata = serverdata;
        }

        public String getPlaynum() {
            return playnum;
        }

        public void setPlaynum(String playnum) {
            this.playnum = playnum;
        }

        public String getHistorytime() {
            return historytime;
        }

        public void setHistorytime(String historytime) {
            this.historytime = historytime;
        }

        public String getAddtime() {
            return addtime;
        }

        public void setAddtime(String addtime) {
            this.addtime = addtime;
        }
    }
}
