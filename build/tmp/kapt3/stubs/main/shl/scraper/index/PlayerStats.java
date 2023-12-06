package shl.scraper.index;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\bZ\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u00ab\u0001B\u0097\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u0003\u0012\b\b\u0002\u0010$\u001a\u00020\u0003\u0012\b\b\u0002\u0010%\u001a\u00020\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010)\u001a\u00020*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u00a2\u0006\u0002\u0010-J\t\u0010z\u001a\u00020\u0003H\u00c6\u0003J\t\u0010{\u001a\u00020\u0003H\u00c6\u0003J\t\u0010|\u001a\u00020\u0003H\u00c6\u0003J\t\u0010}\u001a\u00020\u0003H\u00c6\u0003J\t\u0010~\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u007f\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00104J\n\u0010\u0084\u0001\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00104J\n\u0010\u0086\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00104J\u0011\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00104J\u0011\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00104J\n\u0010\u0099\u0001\u001a\u00020*H\u00c6\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010,H\u00c6\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a0\u0001\u001a\u00020\u0003H\u00c6\u0003J\u00a2\u0003\u0010\u00a1\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010)\u001a\u00020*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,H\u00c6\u0001\u00a2\u0006\u0003\u0010\u00a2\u0001J\u0016\u0010\u00a3\u0001\u001a\u00020J2\n\u0010\u00a4\u0001\u001a\u0005\u0018\u00010\u00a5\u0001H\u00d6\u0003J\n\u0010\u00a6\u0001\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010\u00a7\u0001\u001a\u00020\u00002\u0007\u0010\u00a4\u0001\u001a\u00020\u0000H\u0086\u0002J\n\u0010\u00a8\u0001\u001a\u00020\u0006H\u00d6\u0001J\u0012\u0010\u00a9\u0001\u001a\u00020\u00062\u0007\u0010\u00aa\u0001\u001a\u00020\u0003H\u0002R\u0011\u0010)\u001a\u00020*\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010%\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0015\u0010\'\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R\u0015\u0010&\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00105\u001a\u0004\b6\u00104R\u0015\u00107\u001a\u0004\u0018\u000108\u00a2\u0006\n\n\u0002\u0010;\u001a\u0004\b9\u0010:R\u0011\u0010<\u001a\u000208\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u001d\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00101R\u0011\u0010\u001c\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u00101R\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u00101R\u0011\u0010#\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u00101R\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00101R\u0011\u0010\u001f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u00101R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u00101R\u0015\u0010(\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00105\u001a\u0004\bF\u00104R\u0011\u0010\u001e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00101R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00101R\u0011\u0010I\u001a\u00020J\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010KR\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u00101R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0011\u0010$\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u00101R\u0011\u0010P\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u00101R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u00101R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u00101R\u0011\u0010T\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010NR\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u00101R\u0011\u0010W\u001a\u000208\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010>R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010NR\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u00101R\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u00101R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00105\u001a\u0004\b\\\u00104R\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u00101R\u0011\u0010^\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010NR\u0014\u0010\f\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u00101R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\be\u00101R\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u00101R\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u00101R\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bh\u00101R\u0011\u0010i\u001a\u000208\u00a2\u0006\b\n\u0000\u001a\u0004\bj\u0010>R\u0011\u0010\"\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u00101R\u0011\u0010!\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u00101R\u0011\u0010m\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bn\u0010NR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\n\n\u0002\u00105\u001a\u0004\bo\u00104R\u0011\u0010p\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bq\u0010NR\u0011\u0010 \u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\br\u00101R\u0014\u0010\b\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bs\u0010NR\u001a\u0010\t\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bt\u00101\"\u0004\bu\u0010vR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bw\u00101R\u0011\u0010x\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\by\u0010N\u00a8\u0006\u00ac\u0001"}, d2 = {"Lshl/scraper/index/PlayerStats;", "Lshl/scraper/index/BasePlayerStats;", "id", "", "sthsId", "name", "", "position", "team", "teamId", "gamesPlayed", "league", "season", "timeOnIce", "goals", "assists", "points", "plusMinus", "pim", "ppGoals", "ppAssists", "ppPoints", "ppTimeOnIce", "shGoals", "shAssists", "shPoints", "shTimeOnIce", "fights", "fightWins", "fightLosses", "hits", "giveaways", "takeaways", "shotsOnGoal", "shotsBlocked", "gameRating", "offensiveGameRating", "defensiveGameRating", "faceoffs", "faceoffWins", "gwg", "advancedStats", "Lshl/scraper/index/PlayerStats$AdvancedStats;", "seasonType", "Lshl/scraper/index/SeasonType;", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIIIIIILjava/lang/Integer;IIIIIIIIIIIIIIIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lshl/scraper/index/PlayerStats$AdvancedStats;Lshl/scraper/index/SeasonType;)V", "getAdvancedStats", "()Lshl/scraper/index/PlayerStats$AdvancedStats;", "getAssists", "()I", "getDefensiveGameRating", "getFaceoffWins", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFaceoffs", "faceoffsPercentage", "", "getFaceoffsPercentage", "()Ljava/lang/Double;", "Ljava/lang/Double;", "fantasyPoints", "getFantasyPoints", "()D", "getFightLosses", "getFightWins", "getFights", "getGameRating", "getGamesPlayed", "getGiveaways", "getGoals", "getGwg", "getHits", "getId", "isDefenseman", "", "()Z", "getLeague", "getName", "()Ljava/lang/String;", "getOffensiveGameRating", "onPace", "getOnPace", "getPim", "getPlusMinus", "plusMinusDisplay", "getPlusMinusDisplay", "getPoints", "pointsPerGame", "getPointsPerGame", "getPosition", "getPpAssists", "getPpGoals", "getPpPoints", "getPpTimeOnIce", "pptoi", "getPptoi", "getSeason", "getSeasonType", "()Lshl/scraper/index/SeasonType;", "setSeasonType", "(Lshl/scraper/index/SeasonType;)V", "getShAssists", "getShGoals", "getShPoints", "getShTimeOnIce", "shootingPercentage", "getShootingPercentage", "getShotsBlocked", "getShotsOnGoal", "shtoi", "getShtoi", "getSthsId", "taGaRatio", "getTaGaRatio", "getTakeaways", "getTeam", "getTeamId", "setTeamId", "(I)V", "getTimeOnIce", "toi", "getToi", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIIIIIILjava/lang/Integer;IIIIIIIIIIIIIIIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lshl/scraper/index/PlayerStats$AdvancedStats;Lshl/scraper/index/SeasonType;)Lshl/scraper/index/PlayerStats;", "equals", "other", "", "hashCode", "plus", "toString", "toToi", "minutes", "AdvancedStats", "SHLScraper"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class PlayerStats implements shl.scraper.index.BasePlayerStats {
    private final double pointsPerGame = 0.0;
    private final int onPace = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String plusMinusDisplay = null;
    private final double shootingPercentage = 0.0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double faceoffsPercentage = null;
    private final boolean isDefenseman = false;
    private final double fantasyPoints = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String toi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String pptoi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String shtoi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String taGaRatio = null;
    private final int id = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer sthsId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String position = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String team = null;
    private int teamId;
    private final int gamesPlayed = 0;
    private final int league = 0;
    private final int season = 0;
    private final int timeOnIce = 0;
    private final int goals = 0;
    private final int assists = 0;
    private final int points = 0;
    private final int plusMinus = 0;
    private final int pim = 0;
    private final int ppGoals = 0;
    private final int ppAssists = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer ppPoints = null;
    private final int ppTimeOnIce = 0;
    private final int shGoals = 0;
    private final int shAssists = 0;
    private final int shPoints = 0;
    private final int shTimeOnIce = 0;
    private final int fights = 0;
    private final int fightWins = 0;
    private final int fightLosses = 0;
    private final int hits = 0;
    private final int giveaways = 0;
    private final int takeaways = 0;
    private final int shotsOnGoal = 0;
    private final int shotsBlocked = 0;
    private final int gameRating = 0;
    private final int offensiveGameRating = 0;
    private final int defensiveGameRating = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer faceoffs = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer faceoffWins = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer gwg = null;
    @org.jetbrains.annotations.NotNull()
    private final shl.scraper.index.PlayerStats.AdvancedStats advancedStats = null;
    @org.jetbrains.annotations.Nullable()
    private shl.scraper.index.SeasonType seasonType;
    
    public final double getPointsPerGame() {
        return 0.0;
    }
    
    public final int getOnPace() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlusMinusDisplay() {
        return null;
    }
    
    public final double getShootingPercentage() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getFaceoffsPercentage() {
        return null;
    }
    
    public final boolean isDefenseman() {
        return false;
    }
    
    public final double getFantasyPoints() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPptoi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShtoi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTaGaRatio() {
        return null;
    }
    
    private final java.lang.String toToi(int minutes) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.index.PlayerStats plus(@org.jetbrains.annotations.NotNull()
    shl.scraper.index.PlayerStats other) {
        return null;
    }
    
    @java.lang.Override()
    public int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer getSthsId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPosition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTeam() {
        return null;
    }
    
    @java.lang.Override()
    public int getTeamId() {
        return 0;
    }
    
    public void setTeamId(int p0) {
    }
    
    @java.lang.Override()
    public int getGamesPlayed() {
        return 0;
    }
    
    @java.lang.Override()
    public int getLeague() {
        return 0;
    }
    
    @java.lang.Override()
    public int getSeason() {
        return 0;
    }
    
    public final int getTimeOnIce() {
        return 0;
    }
    
    public final int getGoals() {
        return 0;
    }
    
    public final int getAssists() {
        return 0;
    }
    
    public final int getPoints() {
        return 0;
    }
    
    public final int getPlusMinus() {
        return 0;
    }
    
    public final int getPim() {
        return 0;
    }
    
    public final int getPpGoals() {
        return 0;
    }
    
    public final int getPpAssists() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPpPoints() {
        return null;
    }
    
    public final int getPpTimeOnIce() {
        return 0;
    }
    
    public final int getShGoals() {
        return 0;
    }
    
    public final int getShAssists() {
        return 0;
    }
    
    public final int getShPoints() {
        return 0;
    }
    
    public final int getShTimeOnIce() {
        return 0;
    }
    
    public final int getFights() {
        return 0;
    }
    
    public final int getFightWins() {
        return 0;
    }
    
    public final int getFightLosses() {
        return 0;
    }
    
    public final int getHits() {
        return 0;
    }
    
    public final int getGiveaways() {
        return 0;
    }
    
    public final int getTakeaways() {
        return 0;
    }
    
    public final int getShotsOnGoal() {
        return 0;
    }
    
    public final int getShotsBlocked() {
        return 0;
    }
    
    public final int getGameRating() {
        return 0;
    }
    
    public final int getOffensiveGameRating() {
        return 0;
    }
    
    public final int getDefensiveGameRating() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFaceoffs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFaceoffWins() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getGwg() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.index.PlayerStats.AdvancedStats getAdvancedStats() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public shl.scraper.index.SeasonType getSeasonType() {
        return null;
    }
    
    @java.lang.Override()
    public void setSeasonType(@org.jetbrains.annotations.Nullable()
    shl.scraper.index.SeasonType p0) {
    }
    
    public PlayerStats(int id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sthsId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String position, @org.jetbrains.annotations.NotNull()
    java.lang.String team, int teamId, int gamesPlayed, int league, int season, int timeOnIce, int goals, int assists, int points, int plusMinus, int pim, int ppGoals, int ppAssists, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ppPoints, int ppTimeOnIce, int shGoals, int shAssists, int shPoints, int shTimeOnIce, int fights, int fightWins, int fightLosses, int hits, int giveaways, int takeaways, int shotsOnGoal, int shotsBlocked, int gameRating, int offensiveGameRating, int defensiveGameRating, @org.jetbrains.annotations.Nullable()
    java.lang.Integer faceoffs, @org.jetbrains.annotations.Nullable()
    java.lang.Integer faceoffWins, @org.jetbrains.annotations.Nullable()
    java.lang.Integer gwg, @org.jetbrains.annotations.NotNull()
    shl.scraper.index.PlayerStats.AdvancedStats advancedStats, @org.jetbrains.annotations.Nullable()
    shl.scraper.index.SeasonType seasonType) {
        super();
    }
    
    public PlayerStats() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int component14() {
        return 0;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int component16() {
        return 0;
    }
    
    public final int component17() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component18() {
        return null;
    }
    
    public final int component19() {
        return 0;
    }
    
    public final int component20() {
        return 0;
    }
    
    public final int component21() {
        return 0;
    }
    
    public final int component22() {
        return 0;
    }
    
    public final int component23() {
        return 0;
    }
    
    public final int component24() {
        return 0;
    }
    
    public final int component25() {
        return 0;
    }
    
    public final int component26() {
        return 0;
    }
    
    public final int component27() {
        return 0;
    }
    
    public final int component28() {
        return 0;
    }
    
    public final int component29() {
        return 0;
    }
    
    public final int component30() {
        return 0;
    }
    
    public final int component31() {
        return 0;
    }
    
    public final int component32() {
        return 0;
    }
    
    public final int component33() {
        return 0;
    }
    
    public final int component34() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component35() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component36() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component37() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.index.PlayerStats.AdvancedStats component38() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final shl.scraper.index.SeasonType component39() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shl.scraper.index.PlayerStats copy(int id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sthsId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String position, @org.jetbrains.annotations.NotNull()
    java.lang.String team, int teamId, int gamesPlayed, int league, int season, int timeOnIce, int goals, int assists, int points, int plusMinus, int pim, int ppGoals, int ppAssists, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ppPoints, int ppTimeOnIce, int shGoals, int shAssists, int shPoints, int shTimeOnIce, int fights, int fightWins, int fightLosses, int hits, int giveaways, int takeaways, int shotsOnGoal, int shotsBlocked, int gameRating, int offensiveGameRating, int defensiveGameRating, @org.jetbrains.annotations.Nullable()
    java.lang.Integer faceoffs, @org.jetbrains.annotations.Nullable()
    java.lang.Integer faceoffWins, @org.jetbrains.annotations.Nullable()
    java.lang.Integer gwg, @org.jetbrains.annotations.NotNull()
    shl.scraper.index.PlayerStats.AdvancedStats advancedStats, @org.jetbrains.annotations.Nullable()
    shl.scraper.index.SeasonType seasonType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0011R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016\u00a8\u0006!"}, d2 = {"Lshl/scraper/index/PlayerStats$AdvancedStats;", "", "PDO", "", "GF60", "GA60", "SF60", "SA60", "CF", "", "CA", "CFPct", "CFPctRel", "FF", "FA", "FFPct", "FFPctRel", "(FFFFFIIFFFFFF)V", "getCA", "()I", "getCF", "getCFPct", "()F", "getCFPctRel", "getFA", "getFF", "getFFPct", "getFFPctRel", "getGA60", "getGF60", "getPDO", "getSA60", "getSF60", "SHLScraper"})
    @com.squareup.moshi.JsonClass(generateAdapter = true)
    public static final class AdvancedStats {
        private final float PDO = 0.0F;
        private final float GF60 = 0.0F;
        private final float GA60 = 0.0F;
        private final float SF60 = 0.0F;
        private final float SA60 = 0.0F;
        private final int CF = 0;
        private final int CA = 0;
        private final float CFPct = 0.0F;
        private final float CFPctRel = 0.0F;
        private final float FF = 0.0F;
        private final float FA = 0.0F;
        private final float FFPct = 0.0F;
        private final float FFPctRel = 0.0F;
        
        public final float getPDO() {
            return 0.0F;
        }
        
        public final float getGF60() {
            return 0.0F;
        }
        
        public final float getGA60() {
            return 0.0F;
        }
        
        public final float getSF60() {
            return 0.0F;
        }
        
        public final float getSA60() {
            return 0.0F;
        }
        
        public final int getCF() {
            return 0;
        }
        
        public final int getCA() {
            return 0;
        }
        
        public final float getCFPct() {
            return 0.0F;
        }
        
        public final float getCFPctRel() {
            return 0.0F;
        }
        
        public final float getFF() {
            return 0.0F;
        }
        
        public final float getFA() {
            return 0.0F;
        }
        
        public final float getFFPct() {
            return 0.0F;
        }
        
        public final float getFFPctRel() {
            return 0.0F;
        }
        
        public AdvancedStats(float PDO, float GF60, float GA60, float SF60, float SA60, int CF, int CA, float CFPct, float CFPctRel, float FF, float FA, float FFPct, float FFPctRel) {
            super();
        }
        
        public AdvancedStats() {
            super();
        }
    }
}