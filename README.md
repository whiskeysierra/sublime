# ![Chart search icon](icon.png) Sublime [![Build Status](https://travis-ci.org/whiskeysierra/sublime.png?branch=master)](http://travis-ci.org/whiskeysierra/sublime)

A Sitemap Builder Library for Java.

**This library is still under development.**

## Requirements

- Java 1.7 or higher
- Guava
- ThreeTen Backport

## Installation

## Usage

```java
final SitemapBuilder builder = Sublime.createBuilder();

// usually in a loop
final URL url = builder.createURL();
url.setLocation(new URI("http://www.example.com"));
url.setLastModified(LocalDate.now());
url.setChangeFrequency(ChangeFrequency.MONTHLY);
url.setPriority(0.3);

final Sitemap sitemap = builder.build();
sitemap.writeTo(directory);

```

## Attributions
![Creative Commons License](http://i.creativecommons.org/l/by/3.0/80x15.png)
Chart Search Icon by [Lokas Software](http://www.iconarchive.com/show/vista-artistic-icons-by-awicons/chart-search-icon.html) is licensed under a
[Creative Commons (Attribution 3.0 Unported)](http://creativecommons.org/licenses/by/3.0/): [Lokas Software](http://awicons.com/)
