# DNA Cryptography
The objectives of this project work are:
Implementation of DNA Cryptography with One-Time Pad to make encryption-decryption more secured.
Implementation of Modified Vigenere cipher (Beaufort Cipher) to change the DNA cipher to other format to create confusion.

## Tutorial
> By: Bimochan Shrestha
- [x] Accept Collaborator request?
_specially for_ @bipin21 @shraddha43 and @sus47 :+1:

### step 1
Netbeans maa gayera project ko name DnaCryptography raakhne
close it

git bash kholne

```shell
$ cd Documents/NetbeansProjects/DnaCryptography/src
```
```shell
$ git init
```

### step 2
```shell
$ cd
```
ssh install cha ki nai check garne by entering
```shell
$ ssh -v
```

ssh vaneko secure shell ho.
aba key generate garne
hami kina gardai chau vaney. hamro laptop lai github le authenticate garos vanera. so that hamro commands
le github maa changes garna milos
```shell
$ ssh-keygen
```
enter a file sodhcha. KEI NAHAALNE FILENAME so that default id_rsa nai huncha
hit enter

aba check garne banyo ki nai ssh keys vanera
```shell
$ ls ~/.ssh
```
id_rsa vaneko private key. id_rsa.pub is public.

aba ssh-agent enable garne
enter this in terminal:
```shell
$ eval "$(ssh-agent -s)"
```
aba yo copy paste
```shell
$ ssh-add ~/.ssh/id_rsa
```

### step 3
aba github maa install garne hamro keys
```shell
$ cat ~/.ssh/id_rsa.pub
```
 you will gets something like this
```shell
 ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQC2zeZVIph1tP0UZJ007AC1OWqThpYjDlao1PlQnZbrSMeS8LXkU/nMxuZdAv+2JeqhezOtb6/e
 8e50NOTWB9Z2O8thCMwc29cp6C+vHL2oWQYMcCOuT34/R2yDEOMQ5nkIZ1fVFJNCTIZUaKjyaHX89w0v2p9cMsZ1q36w9lEdKXs8N5fuN
 /6rAy3JQgMcbD+dDd0cWpP8CLiUyNCq32xwqhX+nS1P43AgOQdLpX74uljwr7rE2CmrJQk
 vh/m+h68tv8+mLMGJtg5cJ+doZ+9r9yPhKJYGEsW4bL+8sSRQn3gJWUib8xhOgaWrMfXj+94o1KbcI12lK772GNyP74rX <yourname>@<yourname>
```
 terminal maa aayeko esto lai copy garne

 now open browser
 goto: https://github.com/settings/keys
 login garnu parcha

 click new **ssh** key button
 paste it and save it.

 It's done

### Step 4
 ```shell
 $ cd Documents/NetBeansProject/DnaCryptography/src
 ```
 browser maa https://github.com/sbimochan/DnaCryptography jaane
 ani fork garne
 aba aafno profile maa jaane ani dnacryptography vanne lai click garne ani clone or download button select garne
 ssh ra https option aaucha. select **ssh**
 you will get something like

 git@github.com:<yourname>/DnaCryptography.git
copy it and paste below after git clone.
for e.g:
```shell
$ git clone git@github.com:<yourname>/DnaCryptography.git
 ```
change <your name>
download huncha

aba
```shell
$ git remote -v
```
remote maa k k cha check garne origin wala huncha holaa
e.g
```shell
$ git remote -v
origin  https://github.com/YOUR_USERNAME/YOUR_FORK.git (fetch)
origin  https://github.com/YOUR_USERNAME/YOUR_FORK.git (push)
```
aba arko add garne
```shell
$ git remote add upstream git@github.com:sbimochan/DnaCryptography.git
```

feri remote -v garne
you will get like this:
origin    https://github.com/YOUR_USERNAME/YOUR_FORK.git (fetch)
origin    https://github.com/YOUR_USERNAME/YOUR_FORK.git (push)
upstream  https://github.com/ORIGINAL_OWNER/ORIGINAL_REPOSITORY.git (fetch)
upstream  https://github.com/ORIGINAL_OWNER/ORIGINAL_REPOSITORY.git (push)
aba forks synced huncha

### step 5
aba kei src folder vitra file add garyu vane k garne?
```shell
$ git add .
$ git commit -m "maile yo garey"
$ git push origin master
```
aba browser maa dnacryptography ko link maa jaane ani pull request garne
yo garyo vane ani koi member le accept garyo vane main maa merge huncha

### step 6
aru le kei add garyo and timilai upto date garna paryo.
```shell
$ git pull upstream master
```
yo pull garnu agadi aafu le gareko chij add ra commit ni garnu parcha



