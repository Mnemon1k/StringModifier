# String modifier app

It is a small education app that makes string modifications by POST request to /modify. And to add a new type of modification we did not need to affect the controller and service.

In our case, you need just add it to the StringModificationTypes enumeration and create a class that implements the StringModifier interface, which describes methods modify and getType.

## Get modification types
  Returns avaliable modification types.

* **URL**

  /modifications

* **Method:**

  `GET`

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `[
    "UPPERCASE",
    "LOWERCASE",
    "REVERS"
]`


  * **Code:** 200 <br />
    **Content:** `[]`
    
**Show User**
----
  Returns modificated string.

* **URL**

  /modify

* **Method:**

  `POST`
  
*  **URL Params**

 
   None

* **Data Params**

  ```json
    {
      "sourceString": "",
      "modificationType": ""
    }
  ```
  


* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `String`
 
* **Error Response:**

  * **Code:** 404 Bad Request <br />
    **Content:** `JSON` 
    
    ```json
      {
        "timestamp": "2022-10-01T16:55:01.546+00:00",
        "status": 400,
        "error": "Bad Request",
        "path": "/modify"
      }
    ```

