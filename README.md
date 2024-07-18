# QRCode Testing
Created an object for the QRCodeWriter class,to generate the QR Code based on the Text provided by the user.
In the backend, had used the encode method of the class, which returns a 2D array stored in BitMatrix.
Now, created a blank canvas and by looping through it, set its pixel colour to black and white and set that for that image.
Handled the exception, by displaying the toast message.


Used ZXingScannerView.ResultHandler interface, which is one of the most popular open source API for integrating QR Code Processing.Used its method inorder to open, pause and stop
the device camera for scanning the QRcode.
<br/><br/>
> For the Main Screen User will be able see three options <br/>
  > 1. Enter Text <br/>
  > 2. Generate QR Code <br/>
  > 3. Scan QR Code <br/>

  > User Can Enter Any Text and click on the <h3> 'Generate QR Code Button' </h3> <br/>
  ![image](https://github.com/user-attachments/assets/8cec1699-9ea8-4e77-87f8-3191281719f6)  <br/>

  > After clicking on <h3> 'Generate QR Code Button' </h3> User will navigate to the QRcode Screen <br/><br/>
  ![image](https://github.com/user-attachments/assets/10beabf0-f587-4481-8cbc-e571ece53c7f) <br/>

  > From another device, which has this application installed, user can scan that QRcode and the text entered will displayed that user can copy. <br/><br/>


  
  
