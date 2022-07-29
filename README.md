# cb_ref - инструмент для считывания ставки рефинансирования с помощью веб-службы http://www.cbr.ru/DailyInfoWebServ/DailyInfo.asmx

## Использование инструмента через сохранение в локальный maven репозиторий

Для того, чтобы сохранить проект в локальном maven репозитории, нужно:

* перейти через консоль в корневую папку проекта, запустить команду: `./gradlew clean publishToMavenLocal`
    * сгенерированный артефакт будет лежать в каталоге `C:\Users\<username>\.m2\repository\ru\pchelicam\cbrf\cb_rate`
        * далее можно использовать библиотеку в проекте следующим образом:
            * если проект собирается с помощью maven, то добавить следующую зависимость в `pom.xml`:
              ```
                <dependency>
                  <groupId>ru.pchelicam.cbrf</groupId>
                  <artifactId>cb_rate</artifactId>
                  <version>1.0</version>
                </dependency>
                ```
            * если проект собирается с помощью gradle, добавить следующую зависимость в `build.gradle`:
              ```
              dependencies {
                  ...
                  implementation "ru.pchelicam.cbrf:cb_rate:1.0"
                  ...
              }
              ```
            * добавить в repositories команду:
              ```
              repositories {
                  ...
                  mavenLocal()
                  ...
              }
              ```
        * после чего можно использовать бин `CbRateService` для получения ставки рефинансирования и даты изменения
          ставки. Инициализировать бин можно с помощью аннотации `@Autowired`.