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
# warn("A pull request must have a milestone set") if github.pr_json["milestone"].nil?

# Warn when PR has no assignees
# warn("A pull request must have some assignees") if github.pr_json["assignee"].nil?

####
#
# checkstyle
#
####
checkstyle_format.base_path = Dir.pwd
checkstyle_format.report 'app/build/reports/checkstyle/checkstyle.xml'

####
#
# Findbugs
#
####
findbugs.gradle_task = "app:findbugs"
findbugs.report_file = "app/build/reports/findbugs/findbugs.xml"
findbugs.report(true)

# require 'findbugs_translate_checkstyle_format'
# findbugs_xml = ::FindbugsTranslateCheckstyleFormat::Script.translate(File.read('app/build/reports/findbugs/findbugs.xml'))
# checkstyle_format.report_by_text findbugs_xml

####
#
# Android Lint
#
####
# android_lint.gradle_task = "app:lint"
# android_lint.report_file = "app/build/reports/lint-results.xml"
# android_lint.filtering = true
# android_lint.lint(inline_mode: true)
require 'android_lint_translate_checkstyle_format'
android_lint_xml = ::AndroidLintTranslateCheckstyleFormat::Script.translate(File.read('app/build/reports/lint-results.xml'))
checkstyle_format.report_by_text android_lint_xml


# PMD
require 'pmd_translate_checkstyle_format'
pmd_xml = ::PmdTranslateCheckstyleFormat::Script.translate(File.read('app/build/reports/pmd/pmd.xml'))
checkstyle_format.report_by_text pmd_xml

# PMD-CPD
require 'pmd_translate_checkstyle_format'
pmd_cpd_xml = ::PmdTranslateCheckstyleFormat::Script.translate_cpd(File.read('app/build/reports/pmd/cpd.xml'))
checkstyle_format.report_by_text pmd_cpd_xml