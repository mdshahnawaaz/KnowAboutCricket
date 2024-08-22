package com.cric.apis.entities;



import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="crick_matches")
public class Match {
	
	public Match() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Match(int matchid, String teamHeading, String matchNumberVanue, String battingTeam, String battingTeamScore,
			String bowlTeam, String bowlTeamScore, String liveText, String matchLink, String textComplete,
			MatchStatus status, Date date) {
		super();
		this.matchid = matchid;
		this.teamHeading = teamHeading;
		this.matchNumberVanue = matchNumberVanue;
		this.battingTeam = battingTeam;
		this.battingTeamScore = battingTeamScore;
		this.bowlTeam = bowlTeam;
		this.bowlTeamScore = bowlTeamScore;
		this.liveText = liveText;
		this.matchLink = matchLink;
		this.textComplete = textComplete;
		this.status = status;
		this.date = date;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int matchid;
	
	private String teamHeading;
	
	private String matchNumberVanue;
	
	private String battingTeam;
	
	private String battingTeamScore;
	
	private String bowlTeam;
	
	private String bowlTeamScore;
	
	private  String liveText;
	
	private String matchLink;
	
	private String textComplete;
	
	@Enumerated
	private MatchStatus status;
	
	private Date date=new Date();

	public int getMatchid() {
		return matchid;
	}

	public void setMatchid(int matchid) {
		this.matchid = matchid;
	}

	public String getTeamHeading() {
		return teamHeading;
	}

	public void setTeamHeading(String teamHeading) {
		this.teamHeading = teamHeading;
	}

	public String getMatchNumberVanue() {
		return matchNumberVanue;
	}

	public void setMatchNumberVanue(String matchNumberVanue) {
		this.matchNumberVanue = matchNumberVanue;
	}

	public String getBattingTeam() {
		return battingTeam;
	}

	public void setBattingTeam(String battingTeam) {
		this.battingTeam = battingTeam;
	}

	public String getBattingTeamScore() {
		return battingTeamScore;
	}

	public void setBattingTeamScore(String battingTeamScore) {
		this.battingTeamScore = battingTeamScore;
	}

	public String getBowlTeam() {
		return bowlTeam;
	}

	public void setBowlTeam(String bowlTeam) {
		this.bowlTeam = bowlTeam;
	}

	public String getBowlTeamScore() {
		return bowlTeamScore;
	}

	public void setBowlTeamScore(String bowlTeamScore) {
		this.bowlTeamScore = bowlTeamScore;
	}

	public String getLiveText() {
		return liveText;
	}

	public void setLiveText(String liveText) {
		this.liveText = liveText;
	}

	public String getMatchLink() {
		return matchLink;
	}

	public void setMatchLink(String matchLink) {
		this.matchLink = matchLink;
	}
	
	public void setMatchStatus()
	{
		if(textComplete.isBlank())
		{
			this.status=MatchStatus.LIVE;
		}
		else
		{
			this.status=MatchStatus.COMPLETED;
		}
	}

	public String getTextComplete() {
		return textComplete;
	}

	public void setTextComplete(String textComplete) {
		this.textComplete = textComplete;
	}

	public MatchStatus getStatus() {
		return status;
	}

	public void setStatus(MatchStatus status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Match [matchid=" + matchid + ", teamHeading=" + teamHeading + ", matchNumberVanue=" + matchNumberVanue
				+ ", battingTeam=" + battingTeam + ", battingTeamScore=" + battingTeamScore + ", bowlTeam=" + bowlTeam
				+ ", bowlTeamScore=" + bowlTeamScore + ", liveText=" + liveText + ", matchLink=" + matchLink
				+ ", textComplete=" + textComplete + ", status=" + status + ", date=" + date + "]";
	}
	
	
	
}
