# Emailvalidationsimplilearn

Email validation using Regex

Email validation is required in any of the application that looks for email addresses as required information at the registration stage.

There are five ways through which we can perform email validation using a regular expression show in my source code.

1.Simplest regex to validate email. (Main)
2.Adding restriction on user name part. (EmailIDValidation)
3.E-mail validation permitted by RFC 5322.(EmailIDValidationRFC)
4.Regex to restrict leading, trailing, or consecutive dots in emails(EmailIDvalidationRTCL)
5.Regex to restrict no. of characters in the top-level domain.(EmailIDvelaitionRNCTD)


1.Simplest regex to validate email.The regular expression ^(.+)@(.+)$ is the simplest regular expression the checks the @ symbol only.
 It doesn't care about the characters before and after the '@' symbol.

 2.Adding restriction on user name part.
 The regular expression "^[A-Za-z0-9+_.-]+@(.+)$" also check the user name part of the email address.
 In order to check the user name part of the email, we have added some restrictions by using a regular expression.
 The regex "^[A-Za-z0-9+_.-]+@(.+)$", ^[A-Za-z0-9+_.-] defines the following restriction.

 A-Z characters are allowed
 a-z characters are allowed
 0-9 numbers are allowed
 Additionally email can contain dot(.), underscore(_), and dash(-).
 The remaining characters are not allowed.

 3.E-mail validation permitted by RFC 5322.
 To validate the email permitted by RFC 5322, we use "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$" regular expression.
 It uses all the characters which are allowed by RFC for the email message format.

 4.Regex to restrict leading, trailing, or consecutive dots in emails
 The regular expression "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$"
  restrict us to add consecutive dots, trailing, and leading.
 An email can contain more than one dot in both the local part and the domain name, but consecutive dots are allowed.
 Our email can also not be started or ended with a dot. The regex validates the email based on these three conditions too.

 5.Regex to restrict no. of characters in the top-level domain.
 The regular expression "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$"
  check for at least one dot in the domain name and after the dot, it consist only the letters.
 The top-level domain should have only two to six letters which is also checked by this regex.
