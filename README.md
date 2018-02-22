# APRのお試し手順
Astorのcloneから，サンプルプロジェクトへのAstor適用の手順を示したリポジトリ
Astor実行に独特の癖があるので全手順をスクリプト化

## ディレクトリ構成
`guineapig/`
- APRの適用対象となるサンプルプロジェクト
- Pig1: 素数カウントのバグ → 適切な修正は無理，オーバーフィット修正は可能
- Pig2: 素数カウントのバグ，Pig1の亜種 → FLの閾値を下げれば適切な修正可能
- Pig3: 整数をゼロに一つ近づけるメソッドのバグ → 修正可能
- Pig4: GCDのバグ → 無限ループなので修正無理

`compile-astor.sh`
- Astorのセットアップ手順（git clone ～ mvn compile）

`repair-math70.sh`
- Astor同梱のmath70バグの修正手順

`repair-guineapig.sh`
- 自前サンプルプロジェクトの修正手順

### usage
```sh
$ # setup
$ git clone git@github.com:shinsuke-mat/apr-trial.git
$ cd apr-trial
$ ./setup-astor.sh

$ # math70修正
$ ./repair-math70.sh

$ # サンプルプロジェクト修正
$ ./repair-guineapig.sh Pig3
```
