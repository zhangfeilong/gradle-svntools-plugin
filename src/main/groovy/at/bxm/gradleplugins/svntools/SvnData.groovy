package at.bxm.gradleplugins.svntools

import groovy.transform.ToString

@ToString(includePackage = false, includeNames = true, ignoreNulls = true)
class SvnData {
  long revisionNumber
  String url
  String repositoryRootUrl
  String trunk
  String branch
  String tag
}