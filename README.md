# APRのお試し手順
- Astorのcloneから，サンプルプロジェクトへのAstor適用の手順を示したリポジトリ
- Astor実行に独特の癖があるので全手順をスクリプト化

### ディレクトリ構成
- guineapig
  - APRの適用対象となるサンプルプロジェクト
- compile-astor.sh
  - Astorのセットアップ手順（git clone ～ mvn compile）
- repair-math70.sh
  - Astor同梱のmath70バグの修正手順
- repair-guineapig.sh
  - 自前サンプルプロジェクトの修正手順

### usage
> $ # setup
> $ git clone git@github.com:shinsuke-mat/apr-trial.git
> $ cd apr-trial
> $ ./setup-astor.sh
> 
> $ # math70修正
> $ ./repair-math70.sh
> 
> $ # サンプルプロジェクト修正
> $ ./repair-guineapig.sh Pig3
