package me.jrubio.ZeroStress.model.ContentProvider;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

import java.util.Date;

import me.jrubio.ZeroStress.CompanyLoginActivity;

/**
 *
 * @author Hedi MEJRI (@hedii-mejri)
 *
 */
public class TodoContract implements BaseColumns {

    private TodoContract() {}

    public static String COMPANY_NAME = CompanyLoginActivity.COMPANY_NAME;

    public static final String AUTHORITY = "me.jrubio.ZeroStress.model.provider.TodoProvider";

    public static final String ENDPOINT = "todo";

    public static final Uri CONTENT_URI =
            Uri.parse("content://" + AUTHORITY + "/" + ENDPOINT);

    public static final String CONTENT_TYPE =
            ContentResolver.CURSOR_DIR_BASE_TYPE + "/vnd.me.jrubio.ZeroStress.model.todo";

    public static final String TABLE = "todo"+"_"+CompanyLoginActivity.COMPANY_NAME;

    public static final String TITLE        = "title";
    public static final String DESCRIPTION  = "description";
    public static final String EDITED       = "edited";
    public static final String COMPLETED    = "completed";
    public static final String NOTES        = "notes";
    public static final String COMPANY      = "company";

    public static final String[] PROJECTION_ALL = {_ID, TITLE, DESCRIPTION, EDITED, COMPLETED, NOTES, COMPANY};


    public static final String CREATE_TABLE =
            "CREATE TABLE if not exists " + TABLE
                    + " (" + _ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + TITLE + " TEXT, "
                    + DESCRIPTION + " TEXT, "
                    + NOTES + " TEXT, "
                    + EDITED + " INTEGER, "
                    + COMPLETED + " INTEGER DEFAULT 0, "
                    + COMPANY + " TEXT"
                    + ");";


    public static Date D = new Date();

    /*
    A SECTION QUESTIONS
    */

    public static final String COMMITA1 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[A] 1. WHAT IS YOUR INCIDENT RESPONSE PLAN?', 'An incident response plan is a key " +
                    "document that helps guarantee that the company " +
                    "will survive any glitch, emergency, or disaster that " +
                    "come in its way.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";
    public static final String COMMITA2 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[A] 2. WHAT ARE YOUR STAFF’S QUALIFICATIONS?', 'Simply having a security policy " +
                    "in place doesn’t make a solution secure. You want " +
                    "to make sure that key employees are qualified to " +
                    "respond to security incidents and to carry out the " +
                    "incident response plan.','', " + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";
    public static final String COMMITA3 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[A] 3. WHAT IS YOUR INFOSEC ORGANIZATIONAL STRUCTURE?', 'You want to ask the cloud provider " +
                    "about the organizational structure of their information " +
                    "security team. It doesn’t need to be a formal org " +
                    "chart but you should ask about roles and responsibilities " +
                    "within the organization and understand " +
                    "who reports to whom when it comes to information " +
                    "security.','', " + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";
    public static final String COMMITA4 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[A] 4. INFOSEC POLICIES?', 'Is there a process for reviewing, " +
                    "updating, communicating your information security " +
                    "policies?',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";
    public static final String COMMITA5 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[A] 5. WHAT IS YOUR PRIVACY POLICY?', 'Understanding how the cloud provider " +
                    "collects, uses, and shares information about your " +
                    "company is an important aspect to consider when " +
                    "evaluating solution providers.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITA6 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[A] 6. DO YOUR EMPLOYEES ACKNOWLEDGE POLICIES OR " +
                    "SIGN CONFIDENTIALITY AGREEMENTS?', 'Acknowledgement of security " +
                    "policies is a process in which employees have to sign a document stating they are aware of the company’s " +
                    "security policies. Confidentiality agreements protect " +
                    "not only the company but also the company’s customers " +
                    "from having its confidential or trade secret information " +
                    "disclosed without the company’s consent.\n" +
                    "A strong information security program will contain " +
                    "guidelines related to confidential information and " +
                    "how the policy is enforced.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";
    public static final String COMMITA7 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[A] 7. WHAT IS YOUR CHANGE CONTROL PROCESS?', 'A change control or change management " +
                    "process is a set of procedures put in place to ensure " +
                    "that changes to the IT infrastructure (software " +
                    "and hardware) are handled in a way to minimize " +
                    "potential impact to production systems.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";
    public static final String COMMITA8 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[A] 8. WHAT CERTIFICATIONS OR THIRD-PARTY " +
                    "ATTESTATIONS DO YOU HAVE?', 'Certifications are a good way to " +
                    "get a third-party validation that the vendor you are " +
                    "talking to has security as top-of-mind. (SOC Report / TRUSTe / US-EU Safe Harbor / PCI)',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";
    public static final String COMMITA9 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[A] 9. DO YOU HAVE A DISASTER RECOVERY PLAN?" +
                    "ATTESTATIONS DO YOU HAVE?', 'A Disaster Recovery Plan documents " +
                    "the actions to be taken in case of a disaster so that " +
                    "the IT infrastructure can quickly recover and support " +
                    "business functions.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITA10 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[A] 10. WHAT ARE YOUR NOTIFICATION PROCEDURES?', 'Many states have security breach " +
                    "notification laws but you should ensure the cloud " +
                    "provider has clear policies and procedures for notifying " +
                    "customers in case of a data breach and in case " +
                    "where systems are down.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";


    /*
    B SECTION QUESTIONS
    */

    public static final String COMMITB1 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[B] 1. DESCRIBE YOUR APPLICATION’S ARCHITECTURE AND DIFFERENT TIERS?', 'Software applications developed " +
                    "based on best-practices have multiple “layers” that " +
                    "separate the presentation, application processing, " +
                    "and data management functions in a logical way. \n" +
                    "This not only helps developers make changes to one " +
                    "layer without affecting the whole system, but it also " +
                    "helps when it comes to building secure applications.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITB2 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[B] 2. DESCRIBE YOUR CODING PRACTICES?', 'According to the Software Engineering " +
                    "Institute at Carnegie Mellon, “easily avoided " +
                    "software defects are a primary cause of commonly " +
                    "exploited software vulnerabilities”. Such vulnerabilities " +
                    "are created by software ‘bugs’ in most part " +
                    "due to poor software development practices. Part of " +
                    "a thorough security evaluation includes inquiring " +
                    "about the vendor’s coding practices.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITB3 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[B] 3. HOW DO YOU TEST YOUR APPLICATION?', 'Part of secure coding practices " +
                    "include a thorough Quality Assurance (QA) process " +
                    "that involves testing changes made to the application " +
                    "prior to making it available in production systems.\n Ask the vendor if they have a " +
                    "formal Quality Assurance program.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITB4 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[B] 4. DO YOU PERFORM WEB APPLICATION VULNERABILITY TESTING?', 'Web based applications should be " +
                    "routinely tested for security vulnerabilities. As web " +
                    "servers get upgraded, patches are applied, or changes " +
                    "are made to the application, it is important to look for " +
                    "ways in which security could be compromised and " +
                    "fix any loopholes. \nThis vulnerability testing includes the use of " +
                    "commonly known web application security toolkits " +
                    "and scanners to identify application vulnerabilities " +
                    "before they are released into production.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    /*
    C SECTION QUESTIONS
    */

    public static final String COMMITC1 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[C] 1. HOW DO YOU PROTECT USER AUTHENTICATION INFORMATION?', 'User authentication means the ability " +
                    "to validate a user’s identity prior to granting access " +
                    "to the system. Typically user authentication is followed " +
                    "by user authorization, which means giving the " +
                    "user access only to the areas, files, or features the user " +
                    "is authorized to have. Protecting user authentication " +
                    "information means having a secure way to store data " +
                    "that can be use to validate a user such as usernames, " +
                    "passwords, and other identifying information used " +
                    "by the application.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITC2 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[C] 2. HOW ARE USER FILES STORED? WHAT LEVEL OF ENCRYPTION?', 'Using a secure data center or hosting " +
                    "provider is of no value if customer files are easy to " +
                    "identify and read. Cloud-based providers that take security " +
                    "seriously should offer some kind of encryption " +
                    "for the data they store. \n The most secure providers will " +
                    "give you some form of encryption for the data they " +
                    "store, which is called “encryption at rest”.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITC3 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[C] 3. IS THE SYSTEM MULTI-TENANT?', 'With the advent of cloud computing, " +
                    "it became important to have a way to separate data " +
                    "from multiple customers accessing the same application.\n" +
                    "While the application is the same for all customers, " +
                    "their data has to be segregated in the back-end. " +
                    "The ability to serve multiple customers with the " +
                    "same application is therefore called as “multi-tenant” and it means that in the application’s database each " +
                    "customer (aka tenant) data is kept separate.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITC4 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[C] 4. HOW IS ACCOUNT INFORMATION STORED?', 'Account info be considered sensitive " +
                    "data and protected accordingly to prevent identify " +
                    "theft.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITC5 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[C] 5. ARE USER FILES ACCESSED BY THE VENDOR?', 'All the security controls in place will " +
                    "not do you any good if the vendor has access to your " +
                    "files and can read your confidential data.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITC6 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[C] 6. WHO HAS ACCESS TO USER FILES?', 'The more people inside the vendor’s " +
                    "organization with access to User Files, the greater the " +
                    "potential for data breach. Good vendor security policies " +
                    "will limit who can access user files and in which " +
                    "circumstances.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITC7 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[C] 7. WHEN ARE FILES DELETED?', 'Deleted files by the user are typically " +
                    "held in the cloud-based system for a number of days " +
                    "prior to being actually deleted to help recovery efforts " +
                    "in case of accidental deletion.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITC8 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[C] 8. HOW IS DISK MEDIA DESTROYED WHEN DECOMMISSIONED?', 'As with any hardware part, hard " +
                    "drives get old and have to be replaced. But the risk " +
                    "with disk media is that you can’t simply throw them " +
                    "in the garbage bin otherwise people might still be " +
                    "able to pull out confidential data that was stored " +
                    "there.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITC9 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[C] 9. HOW IS DATA TRANSFERRED (ACCOUNT INFORMATION AND USER FILES)?', 'Data transferred over the internet " +
                    "is typically in what it’s called “plaintext”, meaning " +
                    "there is no encryption or any security that makes it " +
                    "more difficult to read messages sent from one computer " +
                    "to another. Data transferred over the internet " +
                    "without any type of protection can be victim of Packet " +
                    "Sniffing, which is the act of intercepting communication " +
                    "on the internet using either a hardware or " +
                    "software “sniffer” to read the data being transferred " +
                    "between two computers.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITC10 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[C] 10. IS DATA BACKED UP OR COPIED?', 'Security to your files on a cloud " +
                    "server also means having access to them if disaster " +
                    "strikes. Backup policies and procedures are a key " +
                    "aspect of ensuring continued service.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITC11 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[C] 11. IS CUSTOMER DATA (ACCOUNT INFO OR USER FILES) EVER ON REMOVABLE MEDIA?', 'Storing customer data on removable " +
                    "media adds another potential risk for data theft.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITC12 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[C] 12. IS CUSTOMER DATA EVER ON DESKTOPS OR LAPTOPS?', 'Despite the rise of the mobile " +
                    "workforce and of companies allowing employees to " +
                    "work from remote sites, if customer data like account " +
                    "information or user files are at any time stored in laptops, " +
                    "the potential for a security breach is increased.\n" +
                    "Also, storing customer data in desktops, even at the " +
                    "vendor’s offices, is another practice that should be " +
                    "avoided.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    /*
    D SECTION QUESTIONS
    */

    public static final String COMMITD1 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[D] 1. WHO HAS ACCESS TO PRODUCTION SYSTEMS?', 'Production systems are at the heart " +
                    "of the solutions provider operations and represent the " +
                    "physical servers that run the application and store " +
                    "user data. Gaining physical access to the production " +
                    "system is a serious security matter.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITD2 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[D] 2. HOW DO PERSONNEL AUTHENTICATE? HOW DO YOU MANAGE ACCOUNTS?', 'User authentication is one of the " +
                    "potential “weak links” in a security configuration " +
                    "since if the authentication method or process can be " +
                    "fooled the intruder will be able to access the system " +
                    "and data.\n" +
                    "Ensuring a secure authentication procedure together " +
                    "with strong account management is imperative to " +
                    "providing a secure cloud-hosting environment.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITD4 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[D] 4. IS ACCESS TO THE SYSTEM LOGGED?', 'Keeping track of who accessed the " +
                    "system and when is a good practice that can not only " +
                    "avoid security breaches but can also help determine " +
                    "whether a breach occurred and how.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITD3 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[D] 3. HOW ARE PASSWORD POLICIES ENFORCED?', 'Good password policies will require " +
                    "users to login using a strong password and will have " +
                    "strict settings related to password expiration and " +
                    "password length.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITD5 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[D] 5. HOW OFTEN DO YOU PATCH PRODUCTION SYSTEMS?', 'Software vendors routinely release " +
                    "patches and updates to ensure security vulnerabilities " +
                    "are corrected, thus minimizing the chances the " +
                    "production system will be victim of an attack.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITD6 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[D] 6. WHAT ARE THE STANDARD BUILDS BASED ON?', 'Standard builds help ensure that all " +
                    "software developers making changes to the application " +
                    "have their code compiled using the same parameters, " +
                    "thus minimizing errors and giving a more rigid, " +
                    "but secure, approach to new software releases.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITD7 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[D] 7. HOW IS YOUR PRODUCTION NETWORK SEGMENTED FROM YOUR CORPORATE, QA AND DEVELOPMENT ENVIRONMENTS?'" +
                    ", 'Having the production network isolated " +
                    "from corporate, QA and development environments " +
                    "is critical to ensuring proper security so that " +
                    "if one of the networks is breached, the production " +
                    "network will not be compromised.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITD8 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[D] 8. DO YOU PERFORM VULNERABILITY SCANS AND PENETRATION TESTING?', 'In order to ensure a network is " +
                    "secure, routine tests should be performed. Vulnerability " +
                    "scans look for weaknesses in the network that " +
                    "are usually found when the network administrator " +
                    "neglects to install the latest patches and software " +
                    "updates. Penetration tests are another method of " +
                    "ensuring network security by simulating an attack " +
                    "to the network to uncover any problems related to " +
                    "system configuration, hardware or software flaws, or " +
                    "even operational weaknesses.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITD9 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[D] 9. WHAT TYPE OF FIREWALLS DO YOU USE?', 'Firewalls maintain a network secure " +
                    "from outside would-be invaders but not all firewalls " +
                    "are created the same. The most common types of firewall " +
                    "are the Packet Filtering Firewall, Application/ " +
                    "Proxy Firewall, Reverse-Proxy Firewall, and Packet " +
                    "Inspection Firewalls.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITD10 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[D] 10. HOW ARE SYSTEM/NETWORK MONITORING, LOGGING AND ALERTING SETUP?', 'As part of good network security " +
                    "procedures, monitoring the network means being " +
                    "constantly aware of network activity. Reviewing " +
                    "network log files and having an alert procedure is a " +
                    "critical part of keeping a network safe.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    /*
    E SECTION QUESTIONS
    */

    public static final String COMMITE1 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[E] 1. WHAT ARE THE PHYSICAL ACCESS REQUIREMENTS FOR THE DATA CENTER?', 'Gaining access to a company’s " +
                    "servers means the person can put his or her hands " +
                    "directly onto the server and thus either copy data, " +
                    "extract a piece of hardware, or damage it. No firewall, " +
                    "anti-virus, or other software protection will suffice " +
                    "if your server is not physically protected in the data " +
                    "center.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITE2 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[E] 2. HOW IS THE DATA CENTER ACCESS LIST MAINTAINED AND CONTROLLED?', 'Access to a data center should be " +
                    "strictly controlled since gaining physical access to " +
                    "production systems is a great threat to security.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITE3 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[E] 3. WHO HAS ACCESS TO THE DATA CENTER?', 'Although controlling and maintaining " +
                    "the access list is critical, knowing who exactly " +
                    "has access is also important. The bigger the list, the " +
                    "more vulnerable the data center is.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITE4 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[E] 4. IS DATA CENTER PHYSICALLY MONITORED (CAMERAS, GUARDS, ETC.)?'" +
                    ", 'Secure data centers will have physical " +
                    "monitoring, which means that all physical access " +
                    "is monitored to prevent security incidents.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITE5 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[E] 5. WHERE ARE DATA CENTERS LOCATED?', 'Data center location can impact data " +
                    "access speeds.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITE6 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[E] 6. WHAT REDUNDANCY AND AVAILABILITY DOES THE DATA CENTER PROVIDE?'" +
                    ", 'Not all data centers are created " +
                    "equal. Some provide only access to servers with no " +
                    "backup or redundancy in place while others provide " +
                    "additional security and redundant systems in order " +
                    "to keep the services available in case of power or " +
                    "hardware failure.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITE7 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[E] 7. WHAT TYPES OF CERTIFICATIONS DOES THE DATA CENTER HAVE?'" +
                    ", 'After looking at certifications from a " +
                    "software application perspective (as discussed earlier " +
                    "in section I: Information Security Program), data " +
                    "center certifications can help determine whether the " +
                    "appropriate controls and reporting mechanisms of " +
                    "the data center conform to industry standards.',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

     /*
    EXTRA SECTION QUESTIONS
    */

    public static final String COMMITX1 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[SAG] 1. How easy is the solution to use? Is there a steep learning curve?', '',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITX2 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[SAG] 2. Will users have to change how they normally work to use the new service?', '',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITX3 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[SAG] 3. Does it offer additional features like e-signatures as part of the primary application?', '',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITX4 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[SAG] 4. Does it integrate with your existing software, like Microsoft Outlook and Sharepoint?', '',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

    public static final String COMMITX5 =
            "INSERT INTO " + TABLE
                    + " (" + TITLE
                    + ", " + DESCRIPTION
                    + ", " + NOTES
                    + ", " + EDITED
                    + ", " + COMPLETED
                    + ", " + COMPANY
                    + ") "
                    + "VALUES ('[SAG] 5. Is the setup and administration of the solution " +
                    "going to be an added burden for the IT staff or is " +
                    "the solution easily configurable and requires little " +
                    "maintenance?', '',''," + D.getTime() +", 0,'" + CompanyLoginActivity.COMPANY_NAME + "');";

}
