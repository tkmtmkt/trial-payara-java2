study-payara-java2
==================

### 環境

Java8


### ビルド

```sh
./gradlew clean assemble
```


### 実行

```sh
java -jar lib/payara-micro-5.191.jar --port 3000 --rootdir ./root --deploy build/libs/study-payara-java2.war
```


### 確認

```sh
curl -isSL http://localhost:3000/study-payara-java2/app/
```
