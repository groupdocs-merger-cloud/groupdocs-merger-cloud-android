# GroupDocs.Merger Cloud SDK for Android

[GroupDocs.Merger Cloud API](https://products.groupdocs.cloud/merger/android/) empowers developers to integrate advanced document merging and page manipulation functionalities into their Android applications. Supporting over 40 file formats, this REST API allows seamless merging, splitting, and reorganization of document pages, including PDFs, Word documents, Excel spreadsheets, and more. Security features include password protection for documents, while additional file and folder operations streamline cloud storage management. Whether working with cross-format documents or performing complex page manipulations, GroupDocs.Merger Cloud delivers robust tools for secure and efficient document handling across web, desktop, and mobile platforms.

## Installation

Add Internet permission in the AndroidManifest.xml. Example:

```xml
<manifest xmlns:android="http://schemas.android.com/apk/res/android" package="<package name>">
    <uses-permission android:name="android.permission.INTERNET" />
    ...
```

Add following repository and dependency to your android module's build.gradle
after "apply plugin: 'com.android.application'" section:

```javascript
repositories {
    maven {
        url "https://repository.groupdocs.cloud/repo/"
    }
}

...
dependencies {
    ...
    implementation 'com.groupdocs:groupdocs-merger-cloud:25.11'
}
```

## Getting Started

Please follow the [installation](#installation) instruction and use the following Java code:

This example demonstrates merging different Word files seamlessly with a few lines of code:

```java
package examples.DocumentOperations;

import java.util.Arrays;
import com.groupdocs.cloud.merger.client.*;
import com.groupdocs.cloud.merger.model.*;
import com.groupdocs.cloud.merger.model.requests.*;
import com.groupdocs.cloud.merger.api.*;
import examples.Utils;

/**
 * This example demonstrates how to join specific pages from several source documents.
 */
public class Merger_Java_JoinPagesFromVariousDocuments {

	public static void main(String[] args) {		

		DocumentApi apiInstance = new DocumentApi(Utils.GetConfiguration());

		try {
			FileInfo fileInfo1 = new FileInfo();			
			fileInfo1.setFilePath("WordProcessing/sample-10-pages.docx");
			JoinItem item1 = new JoinItem();
			item1.setFileInfo(fileInfo1);
			item1.setPages(Arrays.asList(3, 6, 8));

			FileInfo fileInfo2 = new FileInfo();			
			fileInfo2.setFilePath("WordProcessing/four-pages.docx");
			JoinItem item2 = new JoinItem();
			item2.setFileInfo(fileInfo2);
			item2.setStartPageNumber(1);
			item2.setEndPageNumber(4);
			item2.setRangeMode(JoinItem.RangeModeEnum.ODDPAGES);

			JoinOptions options = new JoinOptions();
			options.setJoinItems(Arrays.asList(item1, item2));
			options.setOutputPath("output/joined-pages.docx");

			JoinRequest request = new JoinRequest(options);

			DocumentResult response = apiInstance.join(request);

			System.err.println("Output file path: " + response.getPath());
		
		} catch (ApiException e) {

			System.err.println("Exception while calling api:");
			e.printStackTrace();
		}
	}
}
```

## Licensing

All GroupDocs.Merger Cloud SDKs are licensed under [MIT License](LICENSE).

## Resources

+ [**Website**](https://www.groupdocs.cloud)
+ [**Product Home**](https://products.groupdocs.cloud/merger)
+ [**Documentation**](https://docs.groupdocs.cloud/display/mergercloud/Home)
+ [**Free Support Forum**](https://forum.groupdocs.cloud/c/merger)
+ [**Blog**](https://blog.groupdocs.cloud/category/merger)

## Contact Us

Your feedback is very important to us. Please feel free to contact us using our [Support Forums](https://forum.groupdocs.cloud/c/merger).
