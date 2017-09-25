####
#
# github comment settings
#
####
github.dismiss_out_of_range_messages
checkstyle_format.base_path = Dir.pwd

####
#
# for PR
#
####
# プルリクが編集中
warn("このプルリクが編集中のようです。") if github.pr_title.include? "[WIP]"

# プルリクがでかすぎる
warn("プルリクの変更箇所が多すぎるので分割しましょう。") if git.lines_of_code > 500

# マージコミットがある
# has_merge_commit = git.commits.any? { |c| c.message =~ /^Merge branch '#{github.branch_for_base}'/ }
# fail "マージコミットがあるのでリベースしましょう。" unless has_merge_commit

# マイルストーンが設定されていない
# has_milestone = github.pr_json["milestone"] != nil
# warn("プルリクにマイルストーンが設定されていないようです。", sticky: false) unless has_milestone

# 誰もアサインされていない
# has_assignee = github.pr_json["assignee"] != nil
# warn("誰もアサインされていないようです。", sticky: false) unless has_assignee

####
#
# checkstyle
#
####
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
android_lint.gradle_task = "app:lint"
android_lint.report_file = "app/build/reports/lint-results.xml"
android_lint.filtering = true
android_lint.lint(inline_mode: true)

# require 'android_lint_translate_checkstyle_format'
# android_lint_xml = ::AndroidLintTranslateCheckstyleFormat::Script.translate(File.read('app/build/reports/lint-results.xml'))
# checkstyle_format.report_by_text android_lint_xml


# PMD
require 'pmd_translate_checkstyle_format'
pmd_xml = ::PmdTranslateCheckstyleFormat::Script.translate(File.read('app/build/reports/pmd/pmd.xml'))
checkstyle_format.report_by_text pmd_xml

# PMD-CPD
require 'pmd_translate_checkstyle_format'
pmd_cpd_xml = ::PmdTranslateCheckstyleFormat::Script.translate_cpd(File.read('app/build/reports/pmd/cpd.xml'))
checkstyle_format.report_by_text pmd_cpd_xml