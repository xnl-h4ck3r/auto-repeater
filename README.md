<center><h1>Auto Repeater<p>Burp Extension</h1></center>

## About

This an altered version of the great **Auto Repeater** extension written by Justin Moore, NCC Group

The original repo can be found on https://github.com/nccgroup/AutoRepeater

The Portswigger version can be found on https://github.com/portswigger/auto-repeater

## What's Different

There is currently a problem with the version in the BApp store and as of writing it isn't in sync with the code changes to the repo. Even if you build the repo from source, there is a big problem where only one Replacement gets executed per request instead of all of them. The NCC version of the code does work and give the correct number of Replacement request, BUT the menu doesn't show.

So, basically I had to combine changes from both repos to get it working. I also made some changes for my own needs:

- The repo assumes Light mode, so I have made it for Dark Mode. Instead of WHITE, it has BLACK for highlighting requests. It also use a better Green and Red for Diff highlighting in Dark Mode.
- Default the Condition "Sent From Tool" to be "Proxy" instead of "Burp"
- Default the Condition "Is In Scope" to be "Enabled"

## Excuses

I'm not a Java programmer and this is a mix of the 2 different versions just to suit my own needs, so it may also contain bugs that I haven't noticed yet.

## Notes

Feel free to use this version too!

Good luck and good hunting!
If you really love the tool (or any others), or they helped you find an awesome bounty, consider [BUYING ME A COFFEE!](https://ko-fi.com/xnlh4ck3r) ☕ (I could use the caffeine!)

🤘 /XNL-h4ck3r
