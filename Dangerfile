####
#
# github comment settings
#
####
github.dismiss_out_of_range_messages

####
#
# for PR
#
####
if github.pr_title.include? "[WIP]" || github.pr_labels.include?("WIP")
  warn("PR is classed as Work in Progress")
end

# Warn when there is a big PR
warn("a large PR") if git.lines_of_code > 300

# Warn when PR has no milestone
warn("A pull request must have a milestone set") if github.pr_json["milestone"].nil?

# Warn when PR has no assignees
warn("A pull request must have some assignees") if github.pr_json["assignee"].nil?

####
#
# Findbugs
#
####
findbugs.report_file = "your_module/build/reports/findbugs/findbugs.xml"
findbugs.gradle_module = "your_module_name"
findbugs.report(true)

####
#
# Android Lint
#
####
android_lint.gradle_task = "your_module:lint"
android_lint.report_file = "your_module/build/reports/lint/lint-result.xml"
android_lint.filtering = true
android_lint.lint(inline_mode: true)