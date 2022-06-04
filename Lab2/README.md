Cas de Test | Résultats Escomptés | Résultats Actuels | Verdict (Succès, Échec, Non-concluant) 
--- | --- | --- | --- 
1 | demande d'inscription acceptée | Err4: Wrong FirstName format, Err5: Wrong LastName format | Échec
2 | demande d'inscription acceptée | Err1: Wrond UserName format, Err3: Size myst be between 6 and 12 | Échec
3 | demande d'inscription acceptée | Err4: Wrong FirstName format, Err5: Wrong LastName format | Échec
4 | demande d'inscription acceptée | Congratulations Bond James!. You are now a member of our site.. | Succès
5 | Err1 | Err1: Wrong UserName format, Err3 Size of UserName must be between 6 and 12, Err4 Wrong FirstName format, Err5 Wrong LastName format, Err6 Failed to convert property value of type java.lang.String to required type java.lang.Integer for property age; nested exception is java.lang.NumberFormatException: For input string: "+@-.AA" | Échec
6 | Err1 | Err1: Wrong UserName format, Err3 Size of UserName must be between 6 and 12, Err6 Wrong Email format, Err6 Failed to convert property value of type java.lang.String to required type java.lang.Integer for property age; nested exception is java.lang.NumberFormatException: For input string: "zzZZz.zz999@zzz.zzzz99999zzzzzzz.zzzzzzz9999zzzzz.zzzzzz" | Échec
7 | Err1 | Err3: Size of Username must be between 6 and 12, Err4: Wrong FirstName format, Err5: Wrong LastName format | Échec
8 | Err1 | Err1: Wrong UserName format | Succès
