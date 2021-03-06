package com.mh.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "t_result_match_ft")
public class TResultMatchFt implements  java.io.Serializable {

 
	private static final long serialVersionUID = 1L;

	// 流水号
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	// 自增长
	@Column(name = "ID", nullable = false)
	private Integer id;

	@Column(name = "leg_gid")
	private String legGid;

	@Column(name = "leg")
	private String leg;

	@Column(name = "gid")
	private String gid;

	@Column(name = "match_time")
	private String matchTime;

	@Column(name = "match_type")
	private String matchType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "search_time")
	private Date searchTime;

	@Column(name = "match_real_time")
	private String matchRealTime;

	@Column(name = "league")
	private String league;

	@Column(name = "team_h")
	private String teamH;

	@Column(name = "team_c")
	private String teamC;

	@Column(name = "hr_score_c")
	private Integer hrScoreC;

	@Column(name = "hr_score_h")
	private Integer hrScoreH;

	@Column(name = "fl_score_c")
	private Integer flScoreC;

	@Column(name = "fl_score_h")
	private Integer flScoreH;

	@Column(name = "hr_score_c_cal")
	private String hrScoreCCal;

	@Column(name = "hr_score_h_cal")
	private String hrScoreHCal;

	@Column(name = "fl_score_c_cal")
	private String flScoreCCal;

	@Column(name = "fl_score_h_cal")
	private String flScoreHCal;

	@Column(name = "match_status")
	private Integer matchStatus;

	@Column(name = "match_settled")
	private Integer matchSettled;

	@Column(name = "tmp1")
	private String tmp1;

	@Column(name = "tmp2")
	private String tmp2;

	@Column(name = "tmp3")
	private String tmp3;

	@Column(name = "match_index")
	private Integer matchIndex;

	@Column(name = "yaozhe_hr_score_c")
	private Integer yaozheHrScoreC;

	@Column(name = "yaozhe_hr_score_h")
	private Integer yaozheHrScoreH;

	@Column(name = "yaozhe_fl_score_c")
	private Integer yaozheFlScoreC;

	@Column(name = "yaozhe_fl_score_h")
	private Integer yaozheFlScoreH;

	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.id
	 * 
	 * @param id
	 *            the value for t_result_match_ft.id
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.leg_gid
	 * 
	 * @return the value of t_result_match_ft.leg_gid
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getLegGid() {
		return legGid;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.leg_gid
	 * 
	 * @param legGid
	 *            the value for t_result_match_ft.leg_gid
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setLegGid(String legGid) {
		this.legGid = legGid;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.leg
	 * 
	 * @return the value of t_result_match_ft.leg
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getLeg() {
		return leg;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.leg
	 * 
	 * @param leg
	 *            the value for t_result_match_ft.leg
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setLeg(String leg) {
		this.leg = leg;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.gid
	 * 
	 * @return the value of t_result_match_ft.gid
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getGid() {
		return gid;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.gid
	 * 
	 * @param gid
	 *            the value for t_result_match_ft.gid
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setGid(String gid) {
		this.gid = gid;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.match_type
	 * 
	 * @return the value of t_result_match_ft.match_type
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getMatchType() {
		return matchType;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.match_type
	 * 
	 * @param matchType
	 *            the value for t_result_match_ft.match_type
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.search_time
	 * 
	 * @return the value of t_result_match_ft.search_time
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public Date getSearchTime() {
		return searchTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.search_time
	 * 
	 * @param searchTime
	 *            the value for t_result_match_ft.search_time
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setSearchTime(Date searchTime) {
		this.searchTime = searchTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.match_time
	 * 
	 * @return the value of t_result_match_ft.match_time
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getMatchTime() {
		return matchTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.match_time
	 * 
	 * @param matchTime
	 *            the value for t_result_match_ft.match_time
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setMatchTime(String matchTime) {
		this.matchTime = matchTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.match_real_time
	 * 
	 * @return the value of t_result_match_ft.match_real_time
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getMatchRealTime() {
		return matchRealTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.match_real_time
	 * 
	 * @param matchRealTime
	 *            the value for t_result_match_ft.match_real_time
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setMatchRealTime(String matchRealTime) {
		this.matchRealTime = matchRealTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.league
	 * 
	 * @return the value of t_result_match_ft.league
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getLeague() {
		return league;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.league
	 * 
	 * @param league
	 *            the value for t_result_match_ft.league
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setLeague(String league) {
		this.league = league;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.team_c
	 * 
	 * @return the value of t_result_match_ft.team_c
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getTeamC() {
		return teamC;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.team_c
	 * 
	 * @param teamC
	 *            the value for t_result_match_ft.team_c
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setTeamC(String teamC) {
		this.teamC = teamC;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.team_h
	 * 
	 * @return the value of t_result_match_ft.team_h
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getTeamH() {
		return teamH;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.team_h
	 * 
	 * @param teamH
	 *            the value for t_result_match_ft.team_h
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setTeamH(String teamH) {
		this.teamH = teamH;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.hr_score_c
	 * 
	 * @return the value of t_result_match_ft.hr_score_c
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getHrScoreC() {
		return hrScoreC;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.hr_score_c
	 * 
	 * @param hrScoreC
	 *            the value for t_result_match_ft.hr_score_c
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setHrScoreC(Integer hrScoreC) {
		this.hrScoreC = hrScoreC;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.hr_score_h
	 * 
	 * @return the value of t_result_match_ft.hr_score_h
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getHrScoreH() {
		return hrScoreH;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.hr_score_h
	 * 
	 * @param hrScoreH
	 *            the value for t_result_match_ft.hr_score_h
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setHrScoreH(Integer hrScoreH) {
		this.hrScoreH = hrScoreH;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.fl_score_c
	 * 
	 * @return the value of t_result_match_ft.fl_score_c
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getFlScoreC() {
		return flScoreC;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.fl_score_c
	 * 
	 * @param flScoreC
	 *            the value for t_result_match_ft.fl_score_c
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setFlScoreC(Integer flScoreC) {
		this.flScoreC = flScoreC;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.fl_score_h
	 * 
	 * @return the value of t_result_match_ft.fl_score_h
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getFlScoreH() {
		return flScoreH;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.fl_score_h
	 * 
	 * @param flScoreH
	 *            the value for t_result_match_ft.fl_score_h
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setFlScoreH(Integer flScoreH) {
		this.flScoreH = flScoreH;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.hr_score_c_cal
	 * 
	 * @return the value of t_result_match_ft.hr_score_c_cal
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getHrScoreCCal() {
		return hrScoreCCal;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.hr_score_c_cal
	 * 
	 * @param hrScoreCCal
	 *            the value for t_result_match_ft.hr_score_c_cal
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setHrScoreCCal(String hrScoreCCal) {
		this.hrScoreCCal = hrScoreCCal;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.hr_score_h_cal
	 * 
	 * @return the value of t_result_match_ft.hr_score_h_cal
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getHrScoreHCal() {
		return hrScoreHCal;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.hr_score_h_cal
	 * 
	 * @param hrScoreHCal
	 *            the value for t_result_match_ft.hr_score_h_cal
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setHrScoreHCal(String hrScoreHCal) {
		this.hrScoreHCal = hrScoreHCal;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.fl_score_c_cal
	 * 
	 * @return the value of t_result_match_ft.fl_score_c_cal
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getFlScoreCCal() {
		return flScoreCCal;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.fl_score_c_cal
	 * 
	 * @param flScoreCCal
	 *            the value for t_result_match_ft.fl_score_c_cal
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setFlScoreCCal(String flScoreCCal) {
		this.flScoreCCal = flScoreCCal;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.fl_score_h_cal
	 * 
	 * @return the value of t_result_match_ft.fl_score_h_cal
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getFlScoreHCal() {
		return flScoreHCal;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.fl_score_h_cal
	 * 
	 * @param flScoreHCal
	 *            the value for t_result_match_ft.fl_score_h_cal
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setFlScoreHCal(String flScoreHCal) {
		this.flScoreHCal = flScoreHCal;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.match_status
	 * 
	 * @return the value of t_result_match_ft.match_status
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getMatchStatus() {
		return matchStatus;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.match_status
	 * 
	 * @param matchStatus
	 *            the value for t_result_match_ft.match_status
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setMatchStatus(Integer matchStatus) {
		this.matchStatus = matchStatus;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.match_settled
	 * 
	 * @return the value of t_result_match_ft.match_settled
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getMatchSettled() {
		return matchSettled;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.match_settled
	 * 
	 * @param matchSettled
	 *            the value for t_result_match_ft.match_settled
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setMatchSettled(Integer matchSettled) {
		this.matchSettled = matchSettled;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.tmp1
	 * 
	 * @return the value of t_result_match_ft.tmp1
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getTmp1() {
		return tmp1;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.tmp1
	 * 
	 * @param tmp1
	 *            the value for t_result_match_ft.tmp1
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setTmp1(String tmp1) {
		this.tmp1 = tmp1;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.tmp2
	 * 
	 * @return the value of t_result_match_ft.tmp2
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getTmp2() {
		return tmp2;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.tmp2
	 * 
	 * @param tmp2
	 *            the value for t_result_match_ft.tmp2
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setTmp2(String tmp2) {
		this.tmp2 = tmp2;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.tmp3
	 * 
	 * @return the value of t_result_match_ft.tmp3
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public String getTmp3() {
		return tmp3;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.tmp3
	 * 
	 * @param tmp3
	 *            the value for t_result_match_ft.tmp3
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setTmp3(String tmp3) {
		this.tmp3 = tmp3;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.yaozhe_hr_score_c
	 * 
	 * @return the value of t_result_match_ft.yaozhe_hr_score_c
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getYaozheHrScoreC() {
		return yaozheHrScoreC;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.yaozhe_hr_score_c
	 * 
	 * @param yaozheHrScoreC
	 *            the value for t_result_match_ft.yaozhe_hr_score_c
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setYaozheHrScoreC(Integer yaozheHrScoreC) {
		this.yaozheHrScoreC = yaozheHrScoreC;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.yaozhe_hr_score_h
	 * 
	 * @return the value of t_result_match_ft.yaozhe_hr_score_h
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getYaozheHrScoreH() {
		return yaozheHrScoreH;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.yaozhe_hr_score_h
	 * 
	 * @param yaozheHrScoreH
	 *            the value for t_result_match_ft.yaozhe_hr_score_h
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setYaozheHrScoreH(Integer yaozheHrScoreH) {
		this.yaozheHrScoreH = yaozheHrScoreH;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.yaozhe_fl_score_c
	 * 
	 * @return the value of t_result_match_ft.yaozhe_fl_score_c
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getYaozheFlScoreC() {
		return yaozheFlScoreC;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.yaozhe_fl_score_c
	 * 
	 * @param yaozheFlScoreC
	 *            the value for t_result_match_ft.yaozhe_fl_score_c
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setYaozheFlScoreC(Integer yaozheFlScoreC) {
		this.yaozheFlScoreC = yaozheFlScoreC;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.yaozhe_fl_score_h
	 * 
	 * @return the value of t_result_match_ft.yaozhe_fl_score_h
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getYaozheFlScoreH() {
		return yaozheFlScoreH;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.yaozhe_fl_score_h
	 * 
	 * @param yaozheFlScoreH
	 *            the value for t_result_match_ft.yaozhe_fl_score_h
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setYaozheFlScoreH(Integer yaozheFlScoreH) {
		this.yaozheFlScoreH = yaozheFlScoreH;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the
	 * value of the database column t_result_match_ft.match_index
	 * 
	 * @return the value of t_result_match_ft.match_index
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public Integer getMatchIndex() {
		return matchIndex;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the
	 * value of the database column t_result_match_ft.match_index
	 * 
	 * @param matchIndex
	 *            the value for t_result_match_ft.match_index
	 * @abatorgenerated Sat Apr 04 09:38:29 CST 2015
	 */
	public void setMatchIndex(Integer matchIndex) {
		this.matchIndex = matchIndex;
	}
}