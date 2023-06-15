package com.devonfw.tools.ide.url.updater.tomcat;

import java.util.regex.Pattern;

import com.devonfw.tools.ide.common.OperatingSystem;
import com.devonfw.tools.ide.url.model.folder.UrlVersion;
import com.devonfw.tools.ide.url.updater.GithubUrlUpdater;

/**
 * {@link GithubUrlUpdater} for Tomcat.
 */
public class TomcatUrlUpdater extends GithubUrlUpdater {

  @Override
  protected String getTool() {

    return "tomcat";
  }

  @Override
  protected String doGetVersionUrl() {

    return "https://github.com/" + getGithubOrganization() + "/" + getGithubRepository() + "/tags";
  }

  @Override
  protected void addVersion(UrlVersion urlVersion) {
    doAddVersion(urlVersion, "https://archive.apache.org/dist/tomcat/tomcat-${major}/v${version}/src/apache-tomcat-${version}-src.${ext}");
  }

  @Override
  protected String getGithubOrganization() {

    return "apache";
  }

  @Override
  protected String getGithubRepository() {

    return "tomcat";
  }
}
