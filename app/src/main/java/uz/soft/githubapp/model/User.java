package uz.soft.githubapp.model;

import java.io.Serializable;

public class User implements Serializable {
    private String login;
    private Integer id;
    private String node_id;
    private String avatar_url;
    private String gravatar_id;
    private String url;
    private String html_url;
    private String followers_url;
    private String following_url;
    private String gists_url;
    private String starred_url;
    private String subscriptions_url;
    private String organizations_url;
    private String repos_url;
    private String events_url;
    private String received_events_url;
    private String type;
    private Boolean site_admin;
    private Object name;
    private Object company;
    private String blog;
    private Object location;
    private Object email;
    private Object hireable;
    private Object bio;
    private Object twitterUsername;
    private Integer publicRepos;
    private Integer publicGists;
    private Integer followers;
    private Integer following;
    private String created_at;
    private String updated_at;

    public User() {
    }

    public User(String login, Integer id, String nodeId, String avatar_url, String gravatarId, String url, String htmlUrl, String followers_url, String followingUrl, String gistsUrl, String starredUrl, String subscriptionsUrl, String organizationsUrl, String reposUrl, String eventsUrl, String receivedEventsUrl, String type, Boolean siteAdmin, Object name, Object company, String blog, Object location, Object email, Object hireable, Object bio, Object twitterUsername, Integer publicRepos, Integer publicGists, Integer followers, Integer following, String createdAt, String updatedAt) {
        this.login = login;
        this.id = id;
        this.node_id = nodeId;
        this.avatar_url = avatar_url;
        this.gravatar_id = gravatarId;
        this.url = url;
        this.html_url = htmlUrl;
        this.followers_url = followers_url;
        this.following_url = followingUrl;
        this.gists_url = gistsUrl;
        this.starred_url = starredUrl;
        this.subscriptions_url = subscriptionsUrl;
        this.organizations_url = organizationsUrl;
        this.repos_url = reposUrl;
        this.events_url = eventsUrl;
        this.received_events_url = receivedEventsUrl;
        this.type = type;
        this.site_admin = siteAdmin;
        this.name = name;
        this.company = company;
        this.blog = blog;
        this.location = location;
        this.email = email;
        this.hireable = hireable;
        this.bio = bio;
        this.twitterUsername = twitterUsername;
        this.publicRepos = publicRepos;
        this.publicGists = publicGists;
        this.followers = followers;
        this.following = following;
        this.created_at = createdAt;
        this.updated_at = updatedAt;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNode_id() {
        return node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getGravatar_id() {
        return gravatar_id;
    }

    public void setGravatar_id(String gravatar_id) {
        this.gravatar_id = gravatar_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getFollowers_url() {
        return followers_url;
    }

    public void setFollowers_url(String followers_url) {
        this.followers_url = followers_url;
    }

    public String getFollowingUrl() {
        return following_url;
    }

    public void setFollowingUrl(String following_url) {
        this.following_url = following_url;
    }

    public String getGists_url() {
        return gists_url;
    }

    public void setGists_url(String gists_url) {
        this.gists_url = gists_url;
    }

    public String getStarred_url() {
        return starred_url;
    }

    public void setStarred_url(String starred_url) {
        this.starred_url = starred_url;
    }

    public String getSubscriptions_url() {
        return subscriptions_url;
    }

    public void setSubscriptions_url(String subscriptions_url) {
        this.subscriptions_url = subscriptions_url;
    }

    public String getOrganizations_url() {
        return organizations_url;
    }

    public void setOrganizations_url(String organizations_url) {
        this.organizations_url = organizations_url;
    }

    public String getRepos_url() {
        return repos_url;
    }

    public void setRepos_url(String repos_url) {
        this.repos_url = repos_url;
    }

    public String getEvents_url() {
        return events_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    public String getReceived_events_url() {
        return received_events_url;
    }

    public void setReceived_events_url(String received_events_url) {
        this.received_events_url = received_events_url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getSite_admin() {
        return site_admin;
    }

    public void setSite_admin(Boolean site_admin) {
        this.site_admin = site_admin;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getCompany() {
        return company;
    }

    public void setCompany(Object company) {
        this.company = company;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public Object getHireable() {
        return hireable;
    }

    public void setHireable(Object hireable) {
        this.hireable = hireable;
    }

    public Object getBio() {
        return bio;
    }

    public void setBio(Object bio) {
        this.bio = bio;
    }

    public Object getTwitterUsername() {
        return twitterUsername;
    }

    public void setTwitterUsername(Object twitterUsername) {
        this.twitterUsername = twitterUsername;
    }

    public Integer getPublicRepos() {
        return publicRepos;
    }

    public void setPublicRepos(Integer publicRepos) {
        this.publicRepos = publicRepos;
    }

    public Integer getPublicGists() {
        return publicGists;
    }

    public void setPublicGists(Integer publicGists) {
        this.publicGists = publicGists;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public Integer getFollowing() {
        return following;
    }

    public void setFollowing(Integer following) {
        this.following = following;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", id=" + id +
                ", nodeId='" + node_id + '\'' +
                ", avatarUrl='" + avatar_url + '\'' +
                ", gravatarId='" + gravatar_id + '\'' +
                ", url='" + url + '\'' +
                ", htmlUrl='" + html_url + '\'' +
                ", followersUrl='" + followers_url + '\'' +
                ", followingUrl='" + following_url + '\'' +
                ", gistsUrl='" + gists_url + '\'' +
                ", starredUrl='" + starred_url + '\'' +
                ", subscriptionsUrl='" + subscriptions_url + '\'' +
                ", organizationsUrl='" + organizations_url + '\'' +
                ", reposUrl='" + repos_url + '\'' +
                ", eventsUrl='" + events_url + '\'' +
                ", receivedEventsUrl='" + received_events_url + '\'' +
                ", type='" + type + '\'' +
                ", siteAdmin=" + site_admin +
                ", name=" + name +
                ", company=" + company +
                ", blog='" + blog + '\'' +
                ", location=" + location +
                ", email=" + email +
                ", hireable=" + hireable +
                ", bio=" + bio +
                ", twitterUsername=" + twitterUsername +
                ", publicRepos=" + publicRepos +
                ", publicGists=" + publicGists +
                ", followers=" + followers +
                ", following=" + following +
                ", createdAt='" + created_at + '\'' +
                ", updatedAt='" + updated_at + '\'' +
                '}';
    }
}
