# JayFX: A Fact Extractor for Eclipse
 [![Java profiler](https://www.ej-technologies.com/images/product_banners/jprofiler_small.png)](https://www.ej-technologies.com/products/jprofiler/overview.html)

## Note

The original project website may be found [here](http://cs.mcgill.ca/~swevo/jayfx/). The source code posted here is meant to include several extensions for modern Java languages.

## Overview

The JayFX Eclipse plug-in allows you to extract various relations (such as method calls) from a program, and to query the plug-in for relations between the different elements of a program. JayFX extracts program information by scanning all the source files in a project. The benefit of using JayFX is to allow very fast structural queries at the cost of an initial analysis time. JayFX is a new release of the plug-in formerly known as [JavaDB](http://www.cs.mcgill.ca/~martin/javadb).

## Download

The JayFX plug-in is now available for download. You can easily install JayFX and obtain its source code through Eclipse's update mechanism. JayFX is distributed under the terms of the [Eclipse Public License, v. 1.0](http://www.eclipse.org/legal/epl-v10.html).

### System requirements 

Eclipse 3.2 or above, Java 1.5. JayFX is currently only tested on Windows and Linux.

### To install JayFX

1. From the Eclipse menu bar, select Help | Software Updates | Find and Install...
2. Select "Search for new features to install" and click Next >
3. Click on the New Remote Site... button.
4. For the name, enter "JayFX Update Site". For the URL, enter "http://www.cs.mcgill.ca/~swevo/jayfx", and click OK
5. Select the new JayFX entry in the list and click Finish
6. In the list of features to install, select the root node of the JayFX tree, and click Next >
7. Select that you accept the terms of the license agreement, and click Next >
8. Click Finish, and then Install
9. Restart your workspace.

### To obtain the source code of JayFX

The JayFX source code is included in the plug-in library (ca.mcgill.cs.swevo.jayfx_installed_version.jar). To obtain the source code:

1. Install JayFX as directed above.
1. Find the directory named ca.mcgill.cs.swevo.jayfx_... in the plugin directory of your Eclipse installation.
1. Unzip the file ca.mcgill.cs.swevo.jayfx_installed_version.jar.

### To obtain the benchmark project

The [JayFX Benchmark](http://cs.mcgill.ca/~swevo/jayfx/JayFXBenchmark.zip) project is used for jUnit Testing and is also available for download.

## People

- [Martin Robillard](http://www.cs.mcgill.ca/~martin) (Project Manager)
- [Isaac Yuen](http://www.cs.mcgill.ca/~iyuen) (Technical Lead)

## Contact Information

Address questions and comments to [Martin Robillard](http://www.cs.mcgill.ca/~martin).
