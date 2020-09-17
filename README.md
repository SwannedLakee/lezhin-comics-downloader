# Lezhin Comics Downloader

![GitHub release (latest by date)](https://img.shields.io/github/v/release/imsejin/lezhin-comics-downloader) ![jdk](https://img.shields.io/badge/jdk-8-orange) ![GitHub](https://img.shields.io/github/license/imsejin/lezhin-comics-downloader)

This is downloader that helps you to login and downloads the specified comic for all lezhin-comics even adults.

※ *The user is responsible for everything that happens using this program.*

<br>

### Preview

![preview.gif](https://user-images.githubusercontent.com/46176032/86532430-d73b8d00-bf04-11ea-9442-064af11aea9c.gif)

<br>

### Usage

1. Check if chrome browser was installed in your device or download it [here](https://www.google.com/chrome).

2. Check your <ins>chrome browser version</ins> with this URI [chrome://version](chrome://version).

   (The first line is the version. e.g. 83.0.4103.116)

3. Download the chrome driver that matches <ins>the version</ins> and your device OS [here](https://chromedriver.chromium.org/downloads) and decompress it.

4. Check if JRE(or JDK) version is greater than or equal to 8 or install it.

5. Download the latest released lezhin-comics-downloader [here](https://github.com/ImSejin/lezhin-comics-downloader/releases).

6. Download config.ini [here](https://raw.githubusercontent.com/ImSejin/lezhin-comics-downloader/master/config.ini) and write your account in the file.

7. Place three files in the same path.

8. Use the following command to run the downloader.



```cmd
java -jar {JAR filename} -l=<language> -n=<comic name> [-r=<episode range>]
```

- *<ins>id</ins>, <ins>password</ins> (required)*: your lezhin comics account, not account of third party platform.
- *<ins>language (required)</ins>*: language of lezhin platform you want to see.
  - **ko** : korean
  - **en** : english
  - **ja** : japanese
- *<ins>comic name</ins> (required)*: webtoon name you want to download.

<img width="350" alt="comic-name" src="https://user-images.githubusercontent.com/46176032/86545858-88c1d900-bf6c-11ea-9c14-64692abbee3a.png">

- *<ins>episode range</ins> (optional)*: range of episodes you want to download.
  - __skipped__ : all episodes
  - __n~__ : from ep.N to the end of the episode
  - __~n__ : from the beginning of the episode to ep.N
  - __m~n__ : from ep.M to ep.N

<br>

### Command examples

```cmd
java -jar lezhin-comics-downloader.jar -l=en -n=appetite
```

Downloads all episodes of the comic named appetite.

<br>

```cmd
java -jar lezhin-comics-downloader.jar -l=en -n=appetite -r=8~
```

Downloads the episodes of the comic named appetite from ep.8 to the end.

<br>

```cmd
java -jar lezhin-comics-downloader.jar -l=en -n=appetite -r=~25
```

Downloads the episodes of the comic named appetite from the beginning to ep.25.

<br>

```cmd
java -jar lezhin-comics-downloader.jar -l=en -n=appetite -r=1~10
```

Downloads the episodes of the comic named appetite from ep.1 to ep.10.

<br>

### Dependencies

- Lombok
- Selenium
- Gson
- Progress Bar
- Ini4j
- Apache Commons CLI


